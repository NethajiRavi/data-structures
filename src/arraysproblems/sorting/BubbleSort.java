package arraysproblems.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = new int[] {13,46,24,52,20,9};

        for(int i =arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]  = arr[j];
                    arr[j] =temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));






    }
}
