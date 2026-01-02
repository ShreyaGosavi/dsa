/*
Problem no: 136 - easy
syntax remembering is the key here
time complexity: o(n) worst case
space complexity: o(n) worst case
 */


import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {
    public static void main(String[] args){
        int[] nums = {1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
//constant space and linear time
//    public int singleNumber(int[] nums) {
//        int ans = 0;
//        for (int num : nums) {
//            ans ^= num;
//        }
//        return ans;
//    }
}
