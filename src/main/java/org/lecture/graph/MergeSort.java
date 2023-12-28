package org.lecture.graph;

import org.lecture.CustomArray;
import org.lecture.CustomArrayImpl;

public class MergeSort implements CustomArraySorter {
    private final boolean debugModeOn;

    public MergeSort(boolean debugModeOn) {
        this.debugModeOn = debugModeOn;
    }

    @Override
    public void sort(CustomArray customArray) {
        CustomArray sortedArray = mergeSort(customArray);
        //We have to update our sortedArray
        for (int i = 0; i < sortedArray.length(); i++) {
            customArray.setValue(i, sortedArray.getValue(i));
        }
        if (debugModeOn) {
            System.out.println(sortedArray);
        }
    }

    private CustomArray mergeSort(CustomArray customArray) {
        if (debugModeOn) {
            System.out.println("mergeSort -> " + customArray.toString());
        }
        //This array is already sorted!
        if (customArray.length() == 1) {
            return customArray;
        }

        int middle = customArray.length() / 2;
        CustomArray left = createAndFillLeftArray(customArray, middle);
        CustomArray right = createAndFillRightArray(customArray, middle);

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeArrays(left, right);
    }

    private static CustomArray createAndFillRightArray(CustomArray customArray, int middle) {
        CustomArray right = new CustomArrayImpl(customArray.length() - middle);
        for (int i = middle; i <= customArray.length() - 1; i++) {
            right.setValue(i - middle, customArray.getValue(i));
        }
        return right;
    }

    private static CustomArray createAndFillLeftArray(CustomArray customArray, int middle) {
        CustomArray left = new CustomArrayImpl(middle);
        for (int i = 0; i <= middle - 1; i++) {
            left.setValue(i, customArray.getValue(i));
        }
        return left;
    }

    private CustomArray mergeArrays(CustomArray left, CustomArray right) {
        if (debugModeOn) {
            System.out.println("mergeArrays -> left: " + left + " right: " + right);
        }
        CustomArray merged = new CustomArrayImpl(left.length() + right.length());
        int indexLeft = 0;
        int indexRight = 0;
        int indexMerged = 0;

        while (indexLeft < left.length() && indexRight < right.length()) {
            if (left.getValue(indexLeft) < right.getValue(indexRight)) {
                merged.setValue(indexMerged, left.getValue(indexLeft));
                indexLeft++;
            } else {
                merged.setValue(indexMerged, right.getValue(indexRight));
                indexRight++;
            }
            indexMerged++;
        }

        while (indexLeft < left.length()) {
            merged.setValue(indexMerged, left.getValue(indexLeft));
            indexLeft++;
            indexMerged++;
        }

        while (indexRight < right.length()) {
            merged.setValue(indexMerged, right.getValue(indexRight));
            indexRight++;
            indexMerged++;
        }

        if (debugModeOn) {
            System.out.println("mergeArrays -> merged" + merged);
        }
        return merged;
    }
}
