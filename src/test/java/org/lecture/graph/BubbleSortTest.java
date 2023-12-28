package org.lecture.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lecture.CustomArray;
import org.lecture.CustomArrayImpl;

class BubbleSortTest {

    private CustomArray customArray;
    private CustomArraySorter sorter;

    @BeforeEach
    void setUp() {
        customArray = new CustomArrayImpl(7);
        customArray.insert(5);
        customArray.insert(1);
        customArray.insert(4);
        customArray.insert(9);
        customArray.insert(0);
        customArray.insert(8);
        customArray.insert(6);
        sorter = new BubbleSort(true);
    }

    @Test
    void sort() {
        sorter.sort(customArray);
        Assertions.assertEquals("[0, 1, 4, 5, 6, 8, 9]", customArray.toString());
    }
}