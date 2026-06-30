package arraysproblems.easy;

public class StockBuyAndSell {

    static void main() {

        int[] nums = new int[]{7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int maxprice = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            }
            maxprice = Math.max(maxprice,nums[i]- minPrice);
        }
        System.out.println(maxprice);
    }
}
