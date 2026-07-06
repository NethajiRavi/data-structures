package arraysproblems.medium;

public class MiniMumSumLenthOfSubArray {

    static void main() {

        int[] nums = new int[]{2, 3, 1, 2, 4, 3};

        int left = 0;
        int sum = 0;
        int target = 7;
        int minLength = Integer.MAX_VALUE;
        boolean minlengthFound = false;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                sum -= nums[left];
                minlengthFound = true;
                minLength = Math.min(minLength, r - left + 1);
                left++;
            }


        }
        System.out.println(minLength);

    }
}
