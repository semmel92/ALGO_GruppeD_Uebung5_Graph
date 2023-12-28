package org.lecture;

import org.lecture.graph.FloydWarshallAlgorithm;

import java.io.IOException;

/**
 * Liest Zahlen aus der Datei src/main/resources/Numbers.csv aus und liefert diese in dem Abstrakten Daten Typ {@link CustomMatrixArray} zurück.
 * Wendet den Floyd-Warshall-Algorithmus an, um die kürzesten Pfade zu berechnen und gibt diese Pfade über die Konsole aus.
 */
public class Main {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        try {
            CustomMatrixArray matrix = fileHandler.readNumbersFromCSV("src/main/resources/FloydWarshall_Numbers.csv", ",");
            FloydWarshallAlgorithm algorithm = new FloydWarshallAlgorithm();
            CustomMatrixArray shortestPaths = algorithm.computeShortestPaths(matrix);

            System.out.println("Kürzeste Pfade zwischen allen Knotenpaaren:");
            printMatrix(shortestPaths);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printMatrix(CustomMatrixArray matrix) {
        for (int i = 0; i < matrix.getRowCount(); i++) {
            for (int j = 0; j < matrix.getColCount(); j++) {
                Integer value = matrix.getValue(i, j);
                if (value == Integer.MAX_VALUE) {
                    System.out.print("INF ");
                } else {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}
