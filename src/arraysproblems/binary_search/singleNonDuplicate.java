package arraysproblems.binary_search;

public class singleNonDuplicate {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            while (low + 1 < mid && arr[low] == arr[low + 1]) {
                low += 2;
            }

            while (high - 1 > mid && arr[high] == arr[high - 1]) {
                high -= 2;
            }

        }
        System.out.println(low);

    }
}
