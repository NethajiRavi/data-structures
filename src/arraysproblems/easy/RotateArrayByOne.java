package arraysproblems.easy;

import java.util.Arrays;

public class RotateArrayByOne {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int temp = arr[0];
        for (int i = 0; i <arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
