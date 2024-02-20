package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

//Sort an array using Bubble Sort
public class SortArray {
    public static int[] arraySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    continue;
                }
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }


}
