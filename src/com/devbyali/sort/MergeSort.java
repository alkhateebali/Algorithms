package com.devbyali.sort;

import java.util.Arrays;

public class MergeSort {

    public void sort(int[] array) {
        if (array.length < 2) return;
        int middle = array.length / 2;

        int[] left = new int[middle];
        int[] right = new int[array.length - middle];

        // Populate left and right sub arrays
        System.arraycopy(array, 0, left, 0, middle);
        System.arraycopy(array, middle, right, 0, array.length - middle);

        sort(left);
        sort(right);
        merge(array, left, right);
    }

    //conquer
    private void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (i < left.length)
            result[k++] = left[i++];
        while (j < right.length)
            result[k++] = right[j++];


    }
}
