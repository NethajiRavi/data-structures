package arraysproblems.kdananes;

public class MaximumProductOfSubArray {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 3, -2, 4};

        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[n - 1 - i];
            max = Math.max(max, Math.max(prefix, suffix));
        }

        System.out.println(max);


    }
}
