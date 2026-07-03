package arraysproblems.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSubSting {
    static void main() {

        int[] arr = new int[]{100, 4, 200, 1, 3, 2};
        Set<Integer> map = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            map.add(arr[i]);
        }

        int count = 0;
        int maxsiz = 0;
        for (int j = 0; j < arr.length; j++) {

            if (map.contains(arr[j] + 1)) {
                count++;
            } else {
                count = 0;
            }

            if(count>maxsiz){
                maxsiz =count+1;
            }

        }
        System.out.println(maxsiz);
    }
}
