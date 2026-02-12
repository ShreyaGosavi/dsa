import java.util.Arrays;

public class JumpGame2_45 {
    public static int jump(int[] nums) {
        return helper(nums, 0);
    }

    public static int helper(int[] nums, int idx){
        if(idx >= nums.length - 1){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= nums[idx] && idx + i < nums.length; i++){
            int steps = helper(nums, idx + i);

            if(steps != Integer.MAX_VALUE){
                ans = Math.min(ans, 1 + steps);
            }
        }
        return ans;
    }

    public static int jump1(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[nums.length - 1] = 0;

        return helper1(nums, 0, dp);
    }

    public static int helper1(int[] nums, int idx, int[] dp){
        if(idx >= nums.length - 1){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= nums[idx] && idx + i < nums.length; i++){
            int steps = helper(nums, idx + i);

            if(steps != Integer.MAX_VALUE){
                ans = Math.min(ans, 1 + steps);
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        dp[idx] = ans;
        return ans;
    }

    public static int jump2(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n - 1] = 0;

        for(int i = n - 2; i >= 0; i--) {
            for(int j = 1; j <= nums[i] && i + j < n; j++) {
                if(dp[i + j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i + j]);
                }
            }
        }

        return dp[0];
    }

    public static void main(String[] args){
        int[] nums = {2, 1, 0, 1, 4};

        System.out.println(jump1(nums));
    }
}
