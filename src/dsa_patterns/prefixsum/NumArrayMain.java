package dsa_patterns.prefixsum;

public class NumArrayMain {
    public static void main(String[] args) {


        int[] arr = new int[]{1,2,3,4,5};
        NumArray numArray =  new NumArray(arr);
        System.out.println(numArray.sumRange(1,3));


    }
}
