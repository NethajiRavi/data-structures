package arraysproblems.binary_search;

public class BinaryUtils {

    public static int getBinaryElement(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (right + left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (mid > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;

    }
}
