package arraysproblems.easy;

public class checkElementIsPresentOrNot {

    public static void main(String[] args) {

        int[] arr =  new int[]{12,121,2345,1,45,67,87};
        int num = 1;
        System.out.println(returnIndexIfElementPresent(arr, num));


    }

    private static Integer returnIndexIfElementPresent(int[] arr, int num) {
        for (int i = 0; i< arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
