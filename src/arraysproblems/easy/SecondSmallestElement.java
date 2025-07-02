package arraysproblems.easy;

public class SecondSmallestElement {

    public static void main(String[] args) {

        Integer smallest = Integer.MAX_VALUE;
        Integer secondSmall = Integer.MAX_VALUE;

        int[] arr = new int[]{21, 23, 211, 34, 11, 24, 1, 34, 56,};

        for (int i = 0; i <= arr.length-1; i++) {

            if (arr[i] < smallest) {
                secondSmall = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != smallest) {
                secondSmall = arr[i];

            }

        }
        System.out.println(secondSmall + "Second Smallest Found");
    }

}
