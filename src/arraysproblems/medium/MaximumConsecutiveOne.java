package arraysproblems.medium;

public class MaximumConsecutiveOne {

    public static void main(String[] args) {


        int [] arr = new int[]{1,1,1,1,0,1,1,1,1,1,0,1,1,1};
        int count =0;
        int max =0;
        for(int i =0;i<= arr.length-1;i++){

            if(arr[i]==1){
                count++;
            }else {
                max  = Math.max(max,count);
                count=0;

            }
        }
        System.out.println(max);

    }
}
