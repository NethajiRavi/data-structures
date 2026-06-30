package arraysproblems.easy;

public class MaximumSubArraySumWithPositive {

    static void main() {


        int [] num = new int[]{10, 5, 2, 7, 1, 9};
        int k =15;

        int left =0;
        int right =0;
        int maxLength =-1;
        int sum =0;

        while ( right< num.length){
            if(left<right && sum>k){
                sum -= num[left];
            }

            if(sum == k){
                maxLength = Math.max(maxLength,right-left);
            }
            right++;

            if(right<num.length){
                sum +=num[right];
            }

        }
        System.out.println(maxLength +"maxLength");

    }
}
