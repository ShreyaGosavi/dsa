import java.util.HashMap;
public class SubarrayKDistinct_992 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        System.out.println(subarraysWithKDistinct(nums, k));
    }

    // Main function: EXACTLY K distinct
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }

    // Helper function: AT MOST K distinct
    private static int countAtMost(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            map.put(num, map.getOrDefault(num, 0) + 1);

            // shrink window until it becomes valid
            while (map.size() > k) {
                int leftNum = nums[left];
                map.put(leftNum, map.get(leftNum) - 1);

                if (map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }
                left++;
            }

            // count all valid subarrays ending at 'right'
            result += (right - left + 1);
        }

        return result;
    }

}
