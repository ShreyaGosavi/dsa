import java.util.HashMap;

public class MaximumSumSubarrayk_2461 {
    public static void main(String[]args){

    }


    public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        long windowSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // add right element
            windowSum += nums[right];
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // wait until window size becomes k
            if (right - left + 1 < k) {
                continue;
            }

            // window size == k
            if (freq.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }

            // slide the window
            freq.put(nums[left], freq.get(nums[left]) - 1);
            if (freq.get(nums[left]) == 0) {
                freq.remove(nums[left]);
            }
            windowSum -= nums[left];
            left++;
        }

        return maxSum;
    }
}
