package arraysproblems.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        // Input array
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};

        // Length of the array
        int n = arr.length;

        /*
         * Logic:
         * ------
         * For each element at index i, compare it with all elements
         * to its right (j = i + 1 to n - 1).
         *
         * If a smaller element is found, swap it with arr[i].
         *
         * After each outer loop iteration, the smallest element
         * from the unsorted portion is placed at its correct position.
         *
         * Example:
         * [13, 46, 24, 52, 20, 9]
         * After 1st pass -> [9, 46, 24, 52, 20, 13]
         * After complete execution -> [9, 13, 20, 24, 46, 52]
         */

        for (int i = 0; i < n; i++) {

            // Compare current element with all remaining elements
            for (int j = i + 1; j < n; j++) {

                // If a smaller element is found, swap
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println(Arrays.toString(arr));

        /*
         * Time Complexity:
         * ----------------
         * Outer loop runs n times.
         * Inner loop runs approximately (n-1) + (n-2) + ... + 1 times.
         *
         * Total Comparisons = n(n-1)/2
         *
         * Best Case    : O(n²)
         * Average Case : O(n²)
         * Worst Case   : O(n²)
         *
         * Space Complexity:
         * -----------------
         * O(1)
         * Only one extra variable (temp) is used for swapping.
         *
         * In-Place Sorting : Yes
         * Stable Sorting   : No
         */
    }
}