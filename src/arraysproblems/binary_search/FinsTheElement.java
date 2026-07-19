package arraysproblems.binary_search;

public class FinsTheElement {

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int index = BinaryUtils.getBinaryElement(arr, target);
        System.out.println(index);

    }

}
