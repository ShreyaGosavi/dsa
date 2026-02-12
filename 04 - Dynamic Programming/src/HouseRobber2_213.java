import java.util.Arrays;

public class HouseRobber2_213 {
    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        return Math.max(
                helper(0, n - 2, nums),
                helper(1, n - 1, nums)
        );
    }

    public static int helper(int i, int l, int[] nums) {
        if (i > l) return 0;

        return Math.max(
                nums[i] + helper(i + 2, l, nums),
                helper(i + 1, l, nums)
        );
    }


    public static int rob1(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        return Math.max(
                robLinear1(nums, 0, n - 2),
                robLinear1(nums, 1, n - 1)
        );
    }

    private static int robLinear1(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, end, start, dp);
    }

    private static int helper(int[] nums, int i, int start, int[] dp) {
        if (i < start) return 0;
        if (dp[i] != -1) return dp[i];

        dp[i] = Math.max(
                nums[i] + helper(nums, i - 2, start, dp),
                helper(nums, i - 1, start, dp)
        );

        return dp[i];
    }
}
