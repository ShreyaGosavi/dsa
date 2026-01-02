/*
Problem no: 349 - easy
time complexity: o(n1 + n2 + ansList.size) worst case
space complexity: o(n) worst case extra space and added space of the ans or result array
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionArrays_349 {
    public static void main(String[] args){
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        List<Integer> ansList = new ArrayList<>(); // Use an ArrayList
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ansList.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }

}
