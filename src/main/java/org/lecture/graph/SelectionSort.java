package org.lecture.graph;

import org.lecture.CustomArray;

public class SelectionSort implements CustomArraySorter {
/**
 * Eine Implementierung des SelectionSort-Algorithmus für die CustomArraySorter-Schnittstelle.
 */
    @Override
    public void sort(CustomArray array) {
        int n = array.length();

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array.getValue(j) != null && array.getValue(min_idx) != null) {
                    if (array.getValue(j) < array.getValue(min_idx)) {
                        min_idx = j;
                    }
                }
            }
            Integer temp = array.getValue(min_idx);
            array.setValue(min_idx, array.getValue(i)); // Verwende set, um den Wert zu ändern
            array.setValue(i, temp); // Verwende set, um den Wert zu ändern
        }
    }
}
