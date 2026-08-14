package arraysproblems.prefix_sum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4};

        productOfArrayExceptSelf(arr);
    }

    private static void productOfArrayExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;

        for (int r = n - 1; r >= 0; r--) {
            res[r] = rightProduct * res[r];
            rightProduct *= nums[r];

        }
        System.out.println(Arrays.toString(res));


    }
}
