package arraysproblems.medium;

public class MaximumConsecutiveOnes {

    static void main() {

        int[] nums = new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int count = 0;
        int left = 0;
        int right = 0;
        int zero = 0;
        int k =3;
        while (right < nums.length) {

            if (nums[right] == 0) {
                zero++;
            }

            while (zero>k){
                if(nums[left] ==0){
                    zero--;
                }
                left++;
            }
            count = Math.max(count,right-left+1);
            right++;
        }
        System.out.println(count);


    }

}

