package arraysproblems.binary_search;

public class PeekElementInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2};

        System.out.println(getPeekElement(arr));


    }

    private static Integer getPeekElement(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (mid>0 &&  arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;

    }
}
