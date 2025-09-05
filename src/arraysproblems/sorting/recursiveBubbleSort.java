package arraysproblems.sorting;

import java.util.Arrays;

public class recursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,11,21,2,1,3,6,7};
        recurBubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void recurBubbleSort(int[] arr, int n) {

        if(n==1){
            return;
        }

        for(int i =0;i<=n-2;i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        recurBubbleSort(arr,n-1);
    }
}
