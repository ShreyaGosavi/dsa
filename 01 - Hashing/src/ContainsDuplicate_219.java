/*
Problem no: 219 - easy
learnt when to use hashset and when hashmap and reverse conditioning
it is not about when to return false and true otherwise it is the reverse
time complexity: o(n) worst case
space complexity: o(n) worst case
 */

import java.util.HashMap;


public class ContainsDuplicate_219 {
    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(nums, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if(Math.abs(map.get(nums[i]) - i) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
