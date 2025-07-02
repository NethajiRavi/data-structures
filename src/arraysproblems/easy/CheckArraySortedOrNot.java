package arraysproblems.easy;

public class CheckArraySortedOrNot {


    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5};

        System.out.println(approach1(arr));
        System.out.println(approach2(arr));


    }

    private static boolean approach1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean approach2(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
