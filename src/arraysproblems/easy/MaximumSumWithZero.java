package arraysproblems.easy;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumWithZero {

    static void main() {


        int[] arr = new int[]{9, -3, 3, -1, 6, -5};

        Map<Integer, Integer> values = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
            } else if (values.containsKey(sum)) {
                maxLength = i-values.get(sum);
            }else {
                values.put(sum,i);
            }

        }
        System.out.println(maxLength);
    }
}
