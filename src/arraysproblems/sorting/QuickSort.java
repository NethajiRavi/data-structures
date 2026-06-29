package arraysproblems.sorting;

import java.util.Arrays;

public class QuickSort {

    static void main() {

        int[] num = new int[]{4, 1, 7, 9, 3};

        quickSortArray(num, 0, num.length-1);
        System.out.println(Arrays.toString(num));


    }

    private static void quickSortArray(int[] num, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotedIndex = partion(num, low, high);
        quickSortArray(num, low, pivotedIndex - 1);
        quickSortArray(num, pivotedIndex + 1, high);
    }

    private static int partion(int[] num, int low, int high) {

        int pivoted = num[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (num[j] <= pivoted) {
                i++;
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
            }
        }

        int temp = num[i+1];
        num[i+1] = num[high];
        num[high] = temp;


        return i+1;

    }
}
