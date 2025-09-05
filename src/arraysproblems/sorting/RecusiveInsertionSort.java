package arraysproblems.sorting;

import java.util.Arrays;

public class RecusiveInsertionSort {

    public static void main(String[] args) {

        int [] arr =  new  int[]{1,42,1,2,4,5,7,5,2,1,3,4};
        recursiveInsertionSort(arr, 1,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveInsertionSort(int[] arr, int length,int n) {
        if(length == n ){
            return;
        }

        int j = length;
        while (length>0 && arr[j-1] < arr[j] && length < n){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j++;
        }
        recursiveInsertionSort(arr,length+1,n);
    }
}
