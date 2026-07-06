package arraysproblems.medium;

import java.util.HashMap;
import java.util.Map;

public class MaximumSubArraySumEqualtok {


    static void main() {


        int[] nums = new int[]{1,2,3};
        int k = 3;
        int count = 0;
        int sum =0;
        Map<Integer, Integer> result = new HashMap<>();
        result.put(0,1);

        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
            int re = sum-k ;

            if(result.containsKey(re)){
                count += result.getOrDefault(re,1);
            }
            result.put(sum,result.getOrDefault(sum,0)+1);
        }
        System.out.println(count);

    }

}
