package arraysproblems.binary_search;

public class LowerBoundElement {

    public static void main(String[] args) {

        int[] arr = new int[]{3,5,8,15,19};
        int x = 9;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low+high)/2;

            if(mid<= x){
                System.out.println(mid);
                break;
            }else if(mid > x){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }

    }
}
