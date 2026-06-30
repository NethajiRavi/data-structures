package arraysproblems.easy;

public class MaximumSubArraySumNegative {

    static void main() {

        int[] arr = {2, 3, 5, -2, 7, -4};
        int sum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }

            if (sum <= 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);


    }
}
