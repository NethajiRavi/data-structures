package arraysproblems.binary_search;

public class FindTheElementInSortedRotatedArray {

    public static void main(String[] args) {


        int[] arr = new int[]{1,3};
        int target = 3;

        System.out.println(findElementInSortedArray(arr, target));
    }

    private static int findElementInSortedArray(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[high] <= target && target < arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;
    }
}
