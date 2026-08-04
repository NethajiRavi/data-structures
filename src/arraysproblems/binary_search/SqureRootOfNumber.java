package arraysproblems.binary_search;

public class SqureRootOfNumber {

    public static void main(String[] args) {

        int n = 2147395599;

        int left = 1;
        int right = n / 2;
        int ans = 0;

        while (left <= right) {


            int mid = left + ((right - left) / 2);
            if ((long) mid * mid <= n) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        System.out.println(ans);


    }
}
