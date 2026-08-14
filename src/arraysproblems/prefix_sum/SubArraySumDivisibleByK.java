package arraysproblems.prefix_sum;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumDivisibleByK {

    public static void main(String[] args) {

        int[] nums = new int[]{-1, 2, 9};
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0, 1);
        int sum = 0;
        int count = 0;
        int num = 2;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % num;
            if (rem < 0) {
                rem += num;
            }
            if (result.containsKey(rem)) {
                count += result.get(rem);
            }
            result.put(rem, result.getOrDefault(rem, 0) + 1);
        }
        System.out.println(count);

    }
}
