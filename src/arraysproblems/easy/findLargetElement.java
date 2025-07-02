package arraysproblems.easy;

import java.util.Arrays;

public class findLargetElement {

    public static void main(String[] args) {

       // Normal Approach

        int[] arr = new int[]{1, 32, 43, 1, 21, 22, 54};
        /*int max = arr[0];
        for (int i =0 ; i <= arr.length -1;i ++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);*/

        System.out.println(sortArray(arr));
    }

    private static String sortArray(int[] arr) {

        // selection soring

        for(int i =0; i<=arr.length-1;i++){
            int min_index = i;

            for(int j =i; j<= arr.length -1;j++){
                if(arr[j] < min_index){
                    min_index = arr[j];
                }

            }

            // Move minimum element to its
            // correct position

            int temp = min_index;
            arr[i] = arr[min_index];
            arr[min_index] = temp;

        }

        return Arrays.toString(arr);
    }

}
