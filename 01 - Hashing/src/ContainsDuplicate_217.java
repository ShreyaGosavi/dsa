/*
Problem no: 217 - easy
learnt when to use hashset and when hashmap
time complexity: o(n) worst case
space complexity: o(n) worst case
 */

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static void main(String[] args){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
