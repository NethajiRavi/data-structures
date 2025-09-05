package arraysproblems.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {13,46,24,52,20,9};
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                if(arr[j] <arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] =temp;
                }

            }
        }
    }
}
