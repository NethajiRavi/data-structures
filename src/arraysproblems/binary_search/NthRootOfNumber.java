package arraysproblems.binary_search;

public class NthRootOfNumber {
    public static void main(String[] args) {

        int n = 3;
        int m = 27;
        int left = 1;
        int ans =1;

        while (left <= n) {
            int mid = left + (n - left) / 2;
            if ((long) mid * mid * mid <= m) {
                left = mid + 1;
                ans = mid;
            } else {
                n = mid - 1;
            }
        }
        System.out.println(ans);

    }
}
