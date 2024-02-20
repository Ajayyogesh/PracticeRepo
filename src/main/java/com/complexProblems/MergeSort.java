package com.complexProblems;

import java.util.Arrays;
/*
Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves, recursively sorts each half,
and then merges the sorted halves to produce a sorted array. The main steps of the Merge Sort algorithm are as follows:

1. Divide: Divide the unsorted array into two halves until each sub-array contains only one element.

2. Conquer: Recursively sort each sub-array.

3. Merge: Merge the sorted sub-arrays to produce a single sorted array.


In this example, the `mergeSorter` method is responsible for dividing the array and calling itself recursively.
The `merger` method is responsible for merging two sorted halves. The process continues until the entire array is sorted.
The time complexity of Merge Sort is O(n log n) in the average and worst cases.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 9, 8, 7, 6};
        System.out.println(Arrays.toString(mergeSorter(a)));
    }

    private static int[] mergeSorter(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSorter(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSorter(Arrays.copyOfRange(arr, mid, arr.length));

        return merger(left, right);
    }

    private static int[] merger(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }

}
