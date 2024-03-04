package com.devbyali.sort;

public class SelectionSort {

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValueIndex = findNextMinimumValue(array, i);
            swap(array, minValueIndex, i);
        }
    }

    private int findNextMinimumValue(int[] array, int i) {
        int minValueIndex = i;
        for (var j = i; j < array.length; j++) {
            if (array[j] < array[minValueIndex])
                minValueIndex = j;
        }
        return minValueIndex;
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
