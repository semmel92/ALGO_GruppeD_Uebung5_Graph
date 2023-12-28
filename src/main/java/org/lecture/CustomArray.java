package org.lecture;


/**
 * Eine Schnittstelle, die die Operationen für ein benutzerdefiniertes Array definiert.
 */public interface CustomArray {

    /**
     * Fügt ein neues Element in das Array ein.
     * @param value Das einzufügende Element.
     */
    void insert(Integer value);

    /**
     * Sucht die nächste freie Stelle im Array und gibt den Index zurück.
     * @return Der Index der nächsten freien Stelle.
     */
    int nextFree();

    /**
     * Löscht erste gefundene Element aus dem Array.
     * @param value Das zu löschende Element.
     */
    void remove(Integer value);

    /**
     * Liefert die Größe des Arrays.
     * @return Die Größe des Arrays.
     */
    int length();

    /**
     * Gibt den Wert an der angegebenen Position im Array zurück.
     *
     * @param index Der Index, an dem der Wert abgerufen werden soll.
     * @return Der Wert an der angegebenen Position oder null, wenn der Index ungültig ist.
     */
    Integer getValue(int index);

    /**
     * Setzt den Wert an der angegebenen Positionmit im Array
     * auf den angegebenen Wert, sofern der Index gültig ist.
     * @param index, an dem Wert festgelegt werden soll.
     * @param value der an der angegebenen Position festgelegt werden soll.
     */
    void setValue(int index, Integer value);

}
