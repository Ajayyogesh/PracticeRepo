package com.complexProblems;

import org.example.SortArray;

// implement a binary search algorithm in Java
/*
Binary search is a search algorithm used to find a specific element in a sorted collection, such as an array or a list.
The key characteristic of binary search is its ability to quickly narrow down the search space by repeatedly dividing it in half.

Here are the main steps of the binary search algorithm:

1. **Initialize:** Set the leftmost and rightmost indices of the search interval. Initially, the entire array is the search interval.
Let `left = 0` and `right = n - 1`, where `n` is the number of elements in the array.

2. **Find Midpoint:** Calculate the midpoint of the current search interval: `mid = (left + right) / 2`.

3. **Compare and Update:** Compare the element at the midpoint (`arr[mid]`) with the target value:
   - If `arr[mid]` is equal to the target, the search is successful, and the index `mid` is returned.
   - If `arr[mid]` is greater than the target, update `right = mid - 1` to search the left half.
   - If `arr[mid]` is less than the target, update `left = mid + 1` to search the right half.

4. **Repeat:** Repeat steps 2-3 until the target is found or the search interval becomes empty (`left > right`).

Binary search is highly efficient compared to linear search, especially for large datasets, as it reduces the search space by half at each step.
The time complexity of binary search is O(log n), where n is the number of elements in the array.
However, it is important to note that binary search requires the collection to be sorted for effective application.
 */
public class BinarySearchAlgo {


    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 7, 8, 9, 33, 55, 66, 7777, 22, 322, 4353};
        int[] sorted = SortArray.arraySort(a);
        int find = 7777;
        System.out.println(myBinarySearch(sorted, find));

    }

    private static int myBinarySearch(int[] arr, int find) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == find) {
                return mid;
            } else if (arr[mid] < find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
