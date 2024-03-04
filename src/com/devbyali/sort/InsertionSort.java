package com.devbyali.sort;

//public class InsertionSort {
//    public void sort(int[] array) {
//        for (var i = 1; i < array.length; i++) {
//            var current = array[i];
//            var j = i - 1;
//            while (j >= 0 && array[j] > current) {
//                array[j + 1] = array[j];
//                j--;
//            }
//            array[j + 1] = current;
//        }
//    }
//}
public class InsertionSort {
    //
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            insert(array, i);
        }
    }

    private void insert(int[] array, int i) {

        for (var j = 0; j < i; j++) {
            if (array[i] < array[j])
                swap(array, i, j);
        }

    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
