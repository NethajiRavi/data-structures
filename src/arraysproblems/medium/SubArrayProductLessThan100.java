package arraysproblems.medium;

public class SubArrayProductLessThan100 {

    static void main() {

        int[] nums = new int[]{10, 5, 2, 6};
        int number = 100;
        int prod = 1;
        int count = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            while (prod >= number) {
                prod /= nums[left];
                left++;
            }
            count += i - left + 1;
        }
        System.out.println(count);
    }
}
