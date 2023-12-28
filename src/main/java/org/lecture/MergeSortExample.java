package org.lecture;

import org.lecture.graph.CustomArraySorter;
import org.lecture.graph.MergeSort;


/**
 * Beispiel zur Veranschaulichung des Merge Sort Algorithmus</br>
 * </br>
 *
 * @author Andreas Dötzl
 * @author Matthias Reihs
 * @author Miklos Komlosy
 */
public class MergeSortExample {

    public static void main(String[] args) {

        CustomArray array = new CustomArrayImpl(9);
        array.insert(5);
        array.insert(2);
        array.insert(4);
        array.insert(8);
        array.insert(1);
        array.insert(9);
        array.insert(7);
        array.insert(3);
        array.insert(6);

        CustomArraySorter sorter = new MergeSort(true);
        sorter.sort(array);
    }
}
