package arraysproblems.binary_search;

public class NumberOfOccurance {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 2, 2, 2, 3};
        int target = 2;

        int firstIndexValue = getFirstOccurence(arr, target);

        if (firstIndexValue == -1) {
            System.out.println("Not Present");
        }
        int lastIndex = getLastOccurance(arr, target);
        int size = lastIndex -firstIndexValue+1;
        System.out.println(size);

    }

    private static int getLastOccurance(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int inxdex = -1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                inxdex = mid;
                low = mid + 1;

            } else {
                high = mid;

            }
        }
        System.out.println(inxdex);
        return inxdex;


    }

    private static int getFirstOccurence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int inxdex = -1;

        while (low < high) {
            int mid = low + high / 2;

            if (arr[mid] == target) {
                inxdex = mid;
                high = mid - 1;

            } else {
                low = mid;

            }
        }
        System.out.println(inxdex);

        return inxdex;


    }
}
