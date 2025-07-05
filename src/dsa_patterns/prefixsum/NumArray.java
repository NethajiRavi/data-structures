package dsa_patterns.prefixsum;

public class NumArray {


    public int[] sumArray;


    public NumArray(int[] arr) {

        for (int i = 1; i <= arr.length-1; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        this.sumArray = arr;

    }


    public  int sumRange(int left,int right){
        if(left ==0){
            return sumArray[right];
        }
        return this.sumArray[right] - this.sumArray[left-1];
    }

    public  int sumIndex(int index){
        if(index ==0){
            return sumArray[index];
        }
        return  this.sumArray[index-1];
    }
}
