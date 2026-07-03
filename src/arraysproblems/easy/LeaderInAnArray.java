package arraysproblems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInAnArray {

    static void main() {

        int[] arr = new int[]{4, 7, 1, 0};
        List<Integer> list =  new ArrayList<>();
        int max = arr[arr.length-1];
        list.add(max);

        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max =arr[i];
            }
        }

        Collections.reverse(list);
        System.out.println(list.toString());


    }
}
