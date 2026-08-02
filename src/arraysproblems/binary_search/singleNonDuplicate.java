package arraysproblems.binary_search;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class singleNonDuplicate {

    public static void main(String[] args) {

        long start = System.nanoTime();
        int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(getUniqueElements(nums));
        long end = System.nanoTime();
        long executionTime = end - start;
        System.out.println("Execution Time in Binary: " + executionTime + " ns");
        System.out.println("Execution Time: " + executionTime / 1_000_000.0 + " ms");


        long start1 = System.nanoTime();
        System.out.println(getUniqueByOptimal(nums));
        long end1 = System.nanoTime();
        long executionTimse = end1 - start1;
        System.out.println("Execution Time in Streams: " + executionTimse + " ns");
        System.out.println("Execution Time: " + executionTimse / 1_000_000.0 + " ms");


    }

    private static Integer getUniqueByOptimal(int[] nums) {

        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }

    private static int getUniqueElements(int[] nums) {

        int n = nums.length;

        // Edge case: only one element in the numsay
        if (n == 1) return nums[0];

        // Edge case: first element is the unique one
        if (nums[0] != nums[1]) return nums[0];

        // Edge case: last element is the unique one
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        // Initialize binary search bounds (exclude first and last index)
        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
