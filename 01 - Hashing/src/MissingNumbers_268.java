/*
Problem no: 268 - easy
time complexity: o(n) worst case
space complexity: o(n) worst case
 */

import java.util.HashSet;
import java.util.Set;

class MissingNumbers_268 {
    public static void main(String[] args){
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        // Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}

