package org.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Eine Klasse, die sich um das Lesen von Zahlen aus einer CSV-Datei kümmert und ein CustomMatrixArray erstellt.
 */
public class FileHandler {

    /**
     * Liest Zahlen aus einer CSV-Datei und erstellt ein CustomMatrixArray. Gibt einen Hinweis aus und beendet das Programm,
     * wenn die Eingabedaten ungültig sind, insbesondere wenn die Distanz eines Knotens zu sich selbst nicht 0 ist oder
     * wenn nicht-numerische Werte gefunden werden.
     *
     * @param fileName  der relative Pfad zur Datei, die eingelesen werden soll.
     *                  Bsp.: src/main/resources/FloydWarshall_Numbers.csv
     * @param separator das Trennzeichen, mit welchem die einzelnen Zahlen voneinander getrennt sind.
     * @return Ein CustomMatrixArray, das die gelesenen Zahlen enthält.
     * @throws IOException Wenn ein Ein-/Ausgabefehler auftritt oder die Eingabedaten ungültig sind.
     */
    public CustomMatrixArray readNumbersFromCSV(String fileName, String separator) throws IOException {
        Path path = Paths.get(fileName);
        String allLines = Files.readString(path);
        String[] rows = allLines.split("\n");

        int rowCount = rows.length;
        int colCount = rows[0].split(separator).length;
        CustomMatrixArray matrix = new CustomMatrixArrayImpl(rowCount, colCount);

        for (int i = 0; i < rowCount; i++) {
            String[] columns = rows[i].split(separator);
            for (int j = 0; j < colCount; j++) {
                try {
                    String value = columns[j].trim();
                    if (i == j && !value.equals("0")) {
                        System.err.println("Fehlerhafte Eingabe: Die Distanz eines Knotens zu sich selbst in Zeile " + (i + 1) + ", Spalte " + (j + 1) + " ist nicht 0. Bitte korrigieren Sie die Eingabedaten.");
                        System.exit(1);
                    }
                    if (value.equalsIgnoreCase("INF")) {
                        matrix.insert(i, j, Integer.MAX_VALUE);
                    } else {
                        matrix.insert(i, j, Integer.parseInt(value));
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Fehlerhafte Eingabe in Zeile " + (i + 1) + ", Spalte " + (j + 1) + ": \"" + columns[j] + "\". Bitte korrigieren Sie die Eingabedaten.");
                    System.exit(1);
                }
            }
        }

        return matrix;
    }
}
