package arraysproblems.binary_search;

public class FisnOutHowMantTimesArrayIsRotated {

    public static void main(String[] args) {

        int[] arr = new int[]{3,4,5,1,2};

        int low = 0;
        int high = arr.length - 1;

        int minIndex = -1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high]) {
                minIndex = mid;
                low = mid+1;
            } else {
                high = mid;
            }
        }
        System.out.println(minIndex+1);

    }
}
