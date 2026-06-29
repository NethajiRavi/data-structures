package arraysproblems.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Input array
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};

        // Length of the array
        int n = arr.length;

        /*
         * Bubble Sort
         * -----------
         * Compare adjacent elements and swap them if they are
         * in the wrong order.
         *
         * After each pass, the largest element "bubbles up"
         * to its correct position at the end of the array.
         *
         * Example:
         * [13, 46, 24, 52, 20, 9]
         *
         * Pass 1:
         * [13, 24, 46, 20, 9, 52]
         * (52 reaches its correct position)
         *
         * Pass 2:
         * [13, 24, 20, 9, 46, 52]
         * (46 reaches its correct position)
         *
         * Continue until the entire array is sorted.
         */

        for (int i = n - 1; i >= 0; i--) {

            // Compare adjacent elements from index 0 to i-1
            for (int j = 0; j < i; j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println(Arrays.toString(arr));

        /*
         * Time Complexity:
         * ----------------
         * Best Case    : O(n²)  (for this implementation)
         * Average Case : O(n²)
         * Worst Case   : O(n²)
         *
         * Number of comparisons:
         * (n-1) + (n-2) + ... + 1
         * = n(n-1)/2
         *
         * Space Complexity:
         * -----------------
         * O(1)
         * Only one temporary variable is used for swapping.
         *
         * Stable Sort  : Yes
         * In-Place Sort: Yes
         */


    }
}
