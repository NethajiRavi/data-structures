package arraysproblems.medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static void main() {


        int[] arr = new int[]{2, 6, 5, 8, 11};
        int target = 14;

        Map<Integer, Integer> value = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = target - arr[i];
            if (value.containsKey(sum)) {
                System.out.println(value.get(sum));
                System.out.println(i);
            } else {
                value.put(arr[i], i);
            }
        }

    }
}
