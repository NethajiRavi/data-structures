package arraysproblems.easy;

import java.util.*;

public class ThreeSum {

    static void main(String[] args) {


        //int[] num = new int[]{-1, 0, 1, 2, -1, -4};
        int[] num = new int[]{-1,0,1,2,-1,-4};
        // Set<List<Integer>> reult = bruteForce(args, num);

        //  optimalSolution(num);

        betterSolution(num);


        //  System.out.println(reult.toString());

    }

    private static void betterSolution(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (i > 0 && num[i - 1] == num[i]) continue;
            ;
            int j = i + 1;
            int k = num.length - 1;
            while (j < k) {
                int sum = num[i] + num[j] + num[k];
                if (sum == 0) {
                    List<Integer> integerLis = new ArrayList<>();
                    integerLis.add(num[i]);
                    integerLis.add(num[j]);
                    integerLis.add(num[k]);
                    result.add(integerLis);
                    j++;
                    k--;
                    while (j < k && num[j] == num[j - 1]) j++;
                    while (j < k && num[k] == num[k + 1]) k--;

                } else if (sum < 0) {
                    j++;

                } else {
                    k--;
                }
            }

        }
        System.out.println(result.toString());
    }

    private static void optimalSolution(int[] num) {

        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            Set<Integer> integers = new HashSet<>();
            for (int j = i + 1; j < num.length; j++) {
                int sum = -(num[i] + num[j]);
                if (integers.contains(sum)) {
                    List<Integer> seq = new ArrayList<>();
                    seq.add(num[i]);
                    seq.add(num[j]);
                    seq.add(sum);
                    Collections.sort(seq);
                    ans.add(seq);
                }
                integers.add(num[j]);

            }
        }

        System.out.println(ans.toString());

    }

    private static Set<List<Integer>> bruteForce(Integer[] args, int[] num) {
        Set<List<Integer>> reult = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(num[i]);
                        ans.add(num[j]);
                        ans.add(num[k]);
                        Collections.sort(ans);
                        reult.add(ans);
                    }

                }

            }
        }
        return reult;
    }
}
