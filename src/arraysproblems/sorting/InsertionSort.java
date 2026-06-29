package arraysproblems.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        // Input array
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};

        /*
         * Insertion Sort
         * --------------
         * Divide the array into two parts:
         * 1. Sorted part (left side)
         * 2. Unsorted part (right side)
         *
         * Pick one element from the unsorted part and insert it
         * into its correct position in the sorted part.
         *
         * Similar to arranging playing cards in your hand.
         *
         * Example:
         * [13, 46, 24, 52, 20, 9]
         *
         * Pass 1:
         * key = 46
         * [13, 46] -> already sorted
         *
         * Pass 2:
         * key = 24
         * Shift 46 to the right
         * [13, 24, 46, 52, 20, 9]
         *
         * Pass 3:
         * key = 52
         * No shifting required
         *
         * Pass 4:
         * key = 20
         * Shift 52, 46, 24
         * [13, 20, 24, 46, 52, 9]
         *
         * Pass 5:
         * key = 9
         * Shift all larger elements
         * [9, 13, 20, 24, 46, 52]
         */

        for (int i = 1; i < arr.length; i++) {

            // Current element to be inserted
            int key = arr[i];

            // Last index of the sorted portion
            int j = i - 1;

            // Shift elements greater than key
            // one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at the correct position
            arr[j + 1] = key;
        }

        // Print sorted array
        System.out.println(Arrays.toString(arr));

        /*
         * Time Complexity:
         * ----------------
         * Best Case    : O(n)
         * (Array already sorted)
         *
         * Average Case : O(n²)
         *
         * Worst Case   : O(n²)
         * (Array sorted in reverse order)
         *
         * Space Complexity:
         * -----------------
         * O(1)
         * No extra data structure is used.
         *
         * Stable Sort  : Yes
         * In-Place Sort: Yes
         */
    }
}
