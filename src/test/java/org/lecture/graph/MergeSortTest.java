package org.lecture.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lecture.CustomArray;
import org.lecture.CustomArrayImpl;

class MergeSortTest {
    private CustomArray customArray;
    private CustomArraySorter sorter;

    @BeforeEach
    void setUp() {
//        [5 2 4 8 1 9 7 3 6]
        customArray = new CustomArrayImpl(9);
        customArray.insert(5);
        customArray.insert(2);
        customArray.insert(4);
        customArray.insert(8);
        customArray.insert(1);
        customArray.insert(9);
        customArray.insert(7);
        customArray.insert(3);
        customArray.insert(6);
        sorter = new MergeSort(true);
    }

    @Test
    void sort() {
        sorter.sort(customArray);
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", customArray.toString());
    }
}