package arraysproblems.binary_search;

public class InsertionPositionOfArray {

    public static void main(String[] args) {


        int[] arr = new int[]{1,3,5,6};
        int target = 7;

        System.out.println(getInsertionPosition(arr, target));

    }

    private static int getInsertionPosition(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 11;
            } else {
                low = mid + 1;
            }

        }

        return ans;
    }
}
