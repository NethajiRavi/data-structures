package arraysproblems.easy;

public class FinsTheMajorityOfElements {

    static void main() {

        int[] arr = new int[]{7, 0, 0, 1, 7, 7, 2, 7, 7};
        int count = 1;
        int element = 0;


        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(element);


    }
}
