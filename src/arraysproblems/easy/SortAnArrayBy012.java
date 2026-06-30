package arraysproblems.easy;

import java.util.Arrays;

public class SortAnArrayBy012 {

    static void main() {

        int[] arr = new int[]{1, 0, 2, 1, 0};
        // Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        int k = (i + j) / 2;

        while (i < k && j > k) {

            if(arr[i] ==0){
                i++;
            }else if(arr[i] == 1){
                int temp =arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }else {
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));


    }
}
