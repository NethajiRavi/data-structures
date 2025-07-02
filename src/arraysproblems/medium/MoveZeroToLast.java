package arraysproblems.medium;

import java.util.Arrays;

public class MoveZeroToLast {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 0, 1};
        System.out.println(Arrays.toString(moveZeroToLast(arr)));

    }

    private static int[] moveZeroToLast(int[] arr) {

        int j = -1;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
            if (j ==-1) {
                return arr;
            }
            for(int k =j+1; k<=arr.length-1;k++){

                if(arr[k] !=0){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                    j++;

                }
            }
        return arr;
    }


}
