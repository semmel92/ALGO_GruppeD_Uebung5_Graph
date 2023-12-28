package org.lecture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lecture.graph.CustomArraySorter;
import org.lecture.graph.SelectionSort;

import static org.junit.jupiter.api.Assertions.*;

public class CustomArrayImplTest {

   private CustomArrayImpl customArray;

    @BeforeEach
    public void setUp() {
        customArray = new CustomArrayImpl(3);
    }
    @Test
    public void testInsert() {
        customArray.insert(10);
        customArray.insert(5);

        assertEquals(10, customArray.getValue(0));
        assertEquals(5, customArray.getValue(1));
        assertEquals("[10, 5, null]", customArray.toString());
    }

    @Test
    public void testInsertException() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> customArray.insert(20));
    }
    @Test
    public void testRemove() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        customArray.remove(5);

        assertEquals("[10, null, 15]", customArray.toString());

    }

    @Test
    public void testSort() {

        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        CustomArraySorter sorter = new SelectionSort();
        sorter.sort(customArray);

        assertEquals("[5, 10, 15]", customArray.toString());
    }

    @Test
    public void testNextFreeFull() {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        assertEquals(-1, customArray.nextFree());
    }
    @Test
    public void testNextFree() {
        customArray.insert(10);
        customArray.insert(5);

        assertEquals(2, customArray.nextFree());
    }


    @Test
    public void testGetValue () {
        assertNull(customArray.getValue(4));
        assertNull(customArray.getValue(1));
    }

    @Test
    public void testSetValue () {
        customArray.insert(10);
        customArray.insert(5);
        customArray.insert(15);

        customArray.setValue(0,20);
        assertEquals("[20, 5, 15]", customArray.toString());
        assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> customArray.setValue(4, 5));
    }
}