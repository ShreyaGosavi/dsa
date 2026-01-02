/*
Problem no: 220 - medium hard (not solved completely by me)
condition 1: abs(i - j) -> managed by the sliding window
condition 2: abs(nums[i] - nums[j] -> managed by the celing and loop
ceiling -> the smallest value that is >= x
Time: O(n log k)
Space: O(k)
 */
import java.util.TreeSet;

public class ContainsDuplicate_220 {
    public static void main(String[] args){

    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff <= 0 || valueDiff < 0) return false;

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long curr = nums[i];

            // Find the smallest number >= (curr - t)
            Long candidate = set.ceiling(curr - valueDiff);

            // Check if it is within (curr + t)
            if (candidate != null && candidate <= curr + valueDiff) {
                return true;
            }

            // Add current number
            set.add(curr);

            // Maintain sliding window of size k
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}
