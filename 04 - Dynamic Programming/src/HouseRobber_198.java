import java.util.Arrays;

public class HouseRobber_198 {
    public int rob(int[] nums) {
        return helper(nums, 0, 0);
    }

    public static int helper(int[] nums, int i, int max){
        if(i >= nums.length){
            return max;
        }

        max = Math.max(helper(nums, i+2, max+nums[i]), helper(nums, i+1, max));
        return max;
    }

    public int rob1(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[0] = nums[0];
        return helper(nums, nums.length - 1, dp);
    }

    public static int helper(int[] nums, int i, int[] dp){
        if(i < 0){
            return 0;
        }
        if(i == 0){
            return nums[0];
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int take = nums[i] + helper(nums, i-2,dp);
        int neglect = helper(nums, i - 1, dp);
        dp[i] = Math.max(take, neglect);
        return dp[i];
    }

    public int rob2(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i= 2; i < nums.length; i++){
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }

        return dp[nums.length - 1];
    }

    public int rob3(int[] nums) {
        if (nums.length == 1) return nums[0];
        int preeee = nums[0];
        int previous =  Math.max(nums[0], nums[1]);

        for(int i= 2; i < nums.length; i++){
            int max = Math.max(nums[i]+ preeee, previous);
            preeee = previous;
            previous = max;
        }

        return previous;
    }
}
