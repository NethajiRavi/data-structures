package arraysproblems.prefix_sum;

import java.util.HashMap;
import java.util.Map;

public class ContainsSubArraySum {
    public static void main(String[] args) {

        int[] arr = new int[]{23, 2, 4, 6, 7};
        int k = 6;
        Map<Integer, Integer> sum = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int rem = prefixSum % k;

            if (sum.containsKey(rem)) {

                if (i - sum.get(rem) + 1 > 2) {
                    System.out.println(true);
                    break;
                }
            } else {
                sum.put(rem, i);
            }
        }
    }
}
