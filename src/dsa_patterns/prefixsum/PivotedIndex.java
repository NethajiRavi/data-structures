package dsa_patterns.prefixsum;

import java.util.Arrays;

public class PivotedIndex {

    /*
     * The pivot index can be defined as the index where the sum
     * of the numbers to the left of the index is equal
     *  to the sum of the numbers to the right of the index.
     * */

    public int[] sumArray;


    public PivotedIndex(int[] arr) {
        for (int i = 1; i <= arr.length-1; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        this.sumArray = arr;

    }

    public  int sumIndex(int index){
        if(index ==0){
            return sumArray[index];
        }
        return  this.sumArray[index-1];
    }

    public  int sumRange(int left,int right){
        if(left ==0){
            return sumArray[right];
        }
        return this.sumArray[right] - this.sumArray[left-1];
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2,1,-1};
        System.out.println(pivotIndex(arr));
    }

    private static int pivotIndex(int[] arr) {

        int[] original = Arrays.copyOf(arr, arr.length);
        PivotedIndex numArray = new PivotedIndex(arr);
        int total = numArray.sumRange(0, arr.length - 1);


        for (int i = 0; i <= original.length - 1; i++) {
            int left = numArray.sumIndex(i);

            if (i == 0) {
                left = 0;
            }
            int right = total - left - original[i];

            if (left == right) {
                return i;
            }

        }
        return -1;
    }


}
