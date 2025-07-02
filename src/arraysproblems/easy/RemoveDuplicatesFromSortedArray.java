package arraysproblems.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 2, 2, 3, 3, 4, 4};
        int k = removeDuplicates(arr);

        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);

        }

    }

    private static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
