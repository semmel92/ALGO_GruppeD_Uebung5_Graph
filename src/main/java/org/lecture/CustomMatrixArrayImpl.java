package org.lecture;

/**
 * Eine Implementierung der CustomMatrixArray-Schnittstelle.
 * Diese Klasse verwaltet eine Matrix von Integer-Werten.
 */
public class CustomMatrixArrayImpl implements CustomMatrixArray {
    private Integer[][] matrix;
    private int rows;
    private int cols;

    /**
     * Konstruktor für die CustomMatrixArrayImpl-Klasse.
     *
     * @param rows Die Anzahl der Zeilen in der Matrix.
     * @param cols Die Anzahl der Spalten in der Matrix.
     */
    public CustomMatrixArrayImpl(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new Integer[rows][cols];
    }

    /**
     * Fügt einen Wert an einer spezifizierten Position in der Matrix ein.
     *
     * @param row   Die Zeilennummer, an der der Wert eingefügt werden soll.
     * @param col   Die Spaltennummer, an der der Wert eingefügt werden soll.
     * @param value Der einzufügende Wert.
     */
    @Override
    public void insert(int row, int col, Integer value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            matrix[row][col] = value;
        }
    }

    /**
     * Gibt den Wert an einer spezifizierten Position in der Matrix zurück.
     *
     * @param row Die Zeilennummer, von der der Wert abgerufen werden soll.
     * @param col Die Spaltennummer, von der der Wert abgerufen werden soll.
     * @return Der Wert an der angegebenen Position oder null, wenn die Position ungültig ist.
     */
    @Override
    public Integer getValue(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return matrix[row][col];
        }
        return null;
    }

    /**
     * Setzt den Wert an einer spezifizierten Position in der Matrix.
     *
     * @param row   Die Zeilennummer, an der der Wert gesetzt werden soll.
     * @param col   Die Spaltennummer, an der der Wert gesetzt werden soll.
     * @param value Der zu setzende Wert.
     */
    @Override
    public void setValue(int row, int col, Integer value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            matrix[row][col] = value;
        }
    }

    /**
     * Gibt die Anzahl der Zeilen in der Matrix zurück.
     *
     * @return Die Anzahl der Zeilen in der Matrix.
     */
    @Override
    public int getRowCount() {
        return rows;
    }

    /**
     * Gibt die Anzahl der Spalten in der Matrix zurück.
     *
     * @return Die Anzahl der Spalten in der Matrix.
     */
    @Override
    public int getColCount() {
        return cols;
    }

}
