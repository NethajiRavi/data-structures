package arraysproblems.easy;

public class SecondLargestElementInArray {


    public static void main(String[] args) {
        int[] arr = new int[]{21, 32, 1000, 65,21, 22, 1000000};
        Integer max_value = Integer.MIN_VALUE;
        Integer second_largest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > max_value) {
                second_largest = max_value;
                max_value = arr[i];
            }else if(arr[i]>second_largest && arr[i] != max_value){
                second_largest = arr[i];
            }

        }
        System.out.println(second_largest);

    }
}
