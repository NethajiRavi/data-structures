package arraysproblems.easy;

import java.util.Arrays;

public class RearrangeBySign {

    static void main() {


        int[] nums = new int[]{1, 2, -4, -5};
        int[] ans = new int[nums.length];

        int p = 0;
        int n = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[n] = nums[i];
                n+=2;
            }else {
                ans[p] = nums[i];
                p+=2;
            }

        }
        System.out.println(Arrays.toString(ans));
    }
}
