package arraysproblems.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = new int[]{4, 2, 1, 6, 7};
        int high = arr.length - 1;

        mergeSort(arr, 0, high);
        System.out.println(Arrays.toString(arr));


    }

    private static void mergeSort(int[] arr, int low, int high) {


        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeElement(arr, low, mid, high);
    }

    private static void mergeElement(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int p = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[p++] = arr[left++];
            } else {
                temp[p++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[p++] = arr[left++];
        }
        while (right <= high) {
            temp[p++] = arr[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}

