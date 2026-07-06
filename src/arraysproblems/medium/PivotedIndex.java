package arraysproblems.medium;

public class PivotedIndex {

    static void main() {

        int[] nums = new int[]{1, 7, 3, 6, 5, 6};

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (rightSum == leftSum) {
                System.out.println(i);
            }
            leftSum += nums[i];
        }

    }
}
