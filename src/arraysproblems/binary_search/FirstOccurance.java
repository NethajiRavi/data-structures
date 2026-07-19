package arraysproblems.binary_search;

public class FirstOccurance {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 4, 13, 13, 13, 20, 40};
        int target = 13;


        System.out.println(lastOccuranceOfElement(arr, target));
    }

    private static int lastOccuranceOfElement(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

}
