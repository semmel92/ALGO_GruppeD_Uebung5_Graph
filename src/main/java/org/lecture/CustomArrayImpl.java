package org.lecture;

import java.util.Arrays;

/**
 * Eine Implementierung der CustomArray-Schnittstelle.
 */
public class CustomArrayImpl implements CustomArray {

    private final Integer[] data;

    /**
     * Konstruktor für die CustomArrayImpl-Klasse.
     *
     * @param size Die Größe des Arrays.
     */
    public CustomArrayImpl(int size) {
        this.data = new Integer[size];
    }

    @Override
    public void insert(Integer value) {
        int index = nextFree();
        if (index != -1) {
            data[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds! The value is: " + value);
        }
    }

    @Override
    public int nextFree() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void remove(Integer value) {
        for (int i = 0; i < data.length; i++) {
            if (value.equals(data[i])) {
                data[i] = null;
                break;
            }
        }
    }

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public Integer getValue(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        }
        return null;
    }

    @Override
    public void setValue(int index, Integer value) {
        if (index >= 0 && index < data.length) {
            data[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException("Index is undefined! The value is not set in Array! : " + value
                    + " index: " + index);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}


