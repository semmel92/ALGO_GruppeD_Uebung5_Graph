package org.lecture;

/**
 * Eine Schnittstelle, die die Operationen für ein benutzerdefiniertes Matrix-Array definiert.
 * Diese Schnittstelle ermöglicht es, Werte in einer zweidimensionalen Matrix zu speichern und abzurufen.
 */
public interface CustomMatrixArray {

    /**
     * Fügt einen Wert an einer bestimmten Position in der Matrix ein.
     *
     * @param row   Die Zeilennummer, an der der Wert eingefügt werden soll.
     * @param col   Die Spaltennummer, an der der Wert eingefügt werden soll.
     * @param value Der einzufügende Wert.
     */
    void insert(int row, int col, Integer value);

    /**
     * Gibt den Wert an einer bestimmten Position in der Matrix zurück.
     *
     * @param row Die Zeilennummer, von der der Wert abgerufen werden soll.
     * @param col Die Spaltennummer, von der der Wert abgerufen werden soll.
     * @return Der Wert an der angegebenen Position oder null, wenn die Position ungültig ist.
     */
    Integer getValue(int row, int col);

    /**
     * Setzt den Wert an einer bestimmten Position in der Matrix.
     *
     * @param row   Die Zeilennummer, an der der Wert gesetzt werden soll.
     * @param col   Die Spaltennummer, an der der Wert gesetzt werden soll.
     * @param value Der zu setzende Wert.
     */
    void setValue(int row, int col, Integer value);

    /**
     * Gibt die Anzahl der Zeilen in der Matrix zurück.
     *
     * @return Die Anzahl der Zeilen in der Matrix.
     */
    int getRowCount();

    /**
     * Gibt die Anzahl der Spalten in der Matrix zurück.
     *
     * @return Die Anzahl der Spalten in der Matrix.
     */
    int getColCount();
}
