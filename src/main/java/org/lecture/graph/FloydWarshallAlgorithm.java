package org.lecture.graph;

import org.lecture.CustomMatrixArray;
import org.lecture.CustomMatrixArrayImpl;

/**
 * Eine Klasse, die den Floyd-Warshall-Algorithmus implementiert.
 */
public class FloydWarshallAlgorithm {

    /**
     * Wendet den Floyd-Warshall-Algorithmus auf die gegebene Matrix an.
     *
     * @param matrix Die Matrix, auf die der Algorithmus angewendet werden soll.
     * @return Eine Matrix mit den kürzesten Pfadlängen zwischen allen Paaren von Knoten.
     */
    public CustomMatrixArray computeShortestPaths(CustomMatrixArray matrix) {
        int size = matrix.getRowCount();
        CustomMatrixArray shortestPaths = new CustomMatrixArrayImpl(size, size);

        // Initialisierung: Kopiere die Eingabematrix in die Ergebnismatrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                shortestPaths.insert(i, j, matrix.getValue(i, j));
            }
        }

        // Floyd-Warshall Algorithmus
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (shortestPaths.getValue(i, k) != Integer.MAX_VALUE
                            && shortestPaths.getValue(k, j) != Integer.MAX_VALUE
                            && shortestPaths.getValue(i, j) > shortestPaths.getValue(i, k) + shortestPaths.getValue(k, j)) {
                        shortestPaths.setValue(i, j, shortestPaths.getValue(i, k) + shortestPaths.getValue(k, j));
                    }
                }
            }
        }

        return shortestPaths;
    }
}
