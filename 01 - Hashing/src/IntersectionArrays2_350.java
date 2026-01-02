/*
Problem no: 350 - easy
time complexity: o(n1 + n2 + ansList.size) worst case
space complexity: o(n) worst case extra space and added space of the ans or result array
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionArrays2_350 {
    public static void main(String[] args){
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: nums1){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> ansList = new ArrayList<>(); // Use an ArrayList
        for (int i = 0; i < nums2.length; i++) {
            if (freq.getOrDefault(nums2[i], 0) > 0) {
                ansList.add(nums2[i]);
                freq.put(nums2[i], freq.get(nums2[i]) - 1);
            }
        }

        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}
