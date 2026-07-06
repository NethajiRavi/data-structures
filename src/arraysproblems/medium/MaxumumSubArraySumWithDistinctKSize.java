package arraysproblems.medium;

import java.util.HashMap;
import java.util.Map;

public class MaxumumSubArraySumWithDistinctKSize {

    static void main() {


        int[] nums = new int[]{1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        int left = 0;
        long maxSum = 0;
        long leftSum = 0;
        Map<Integer, Integer> result = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            leftSum += nums[right];
            result.put(nums[right], result.getOrDefault(nums[right], 0) + 1);

            if (right - left + 1 > k) {
                leftSum -= nums[left];

                result.put(nums[left], result.getOrDefault(nums[left], 0) - 1);
                if (result.get(nums[left]) == 0) {
                    result.remove(nums[left]);
                }
                left++;
            }

            if (right - left + 1 == k && result.size() == k) {
                maxSum = Math.max(leftSum, maxSum);
            }
        }
        System.out.println(maxSum);

    }
}
