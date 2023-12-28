package org.lecture.graph;

import org.lecture.CustomArray;

/**
 * Zusätzliche implementierung des BubbleSort Algorithmus.
 */
public class BubbleSort implements CustomArraySorter {
    private final boolean debugModeOn;

    public BubbleSort(boolean debugModeOn) {
        this.debugModeOn = debugModeOn;
    }

    @Override
    public void sort(CustomArray customArray) {
        for (int transition = customArray.length() - 1; transition > 0; transition--) {
            if (debugModeOn) {
                System.out.println(customArray);
            }
            for (int index = 0; index < transition; index++) {
                Integer leftBubbleValue = customArray.getValue(index);
                Integer rightBubbleValue = customArray.getValue(index + 1);
                if (debugModeOn) {
                    System.out.println("check [" + leftBubbleValue + " " + rightBubbleValue + "] " + customArray + " transition=" + transition + " index=" + index);
                }
                if (leftBubbleValue > rightBubbleValue) {
                    customArray.setValue(index, rightBubbleValue);
                    customArray.setValue(index + 1, leftBubbleValue);
                }
            }
        }
        if (debugModeOn) {
            System.out.println("Bubble sort completed! " + customArray);
        }
    }
}
