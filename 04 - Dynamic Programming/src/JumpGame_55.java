public class JumpGame_55 {
    public static boolean canJump(int[] nums) {
        return helper(nums, 0);
    }

    public static boolean helper(int[] nums, int idx){
        if(idx >= nums.length - 1){
            return true;
        }
        if(nums[idx] == 0){
            return false;
        }
        for(int j = 1; j <= nums[idx]; j++){
            boolean ans = helper(nums, idx+j);

            if(ans){
                return true;
            }
        }
        return false;
    }

    public static boolean canJump1(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        dp[nums.length - 1] = true;
        return helper(nums, 0, dp);
    }

    public static boolean helper(int[] nums, int idx, Boolean[] dp){
        if(idx >= nums.length - 1){
            return true;
        }
        if(nums[idx] == 0){
            dp[idx] = false;
            return false;
        }
        if(dp[idx] != null){
            return dp[idx];
        }
        for(int j = 1; j <= nums[idx]; j++){
            boolean ans = helper(nums, idx+j, dp);

            if(ans){
                dp[idx] = true;
                return true;
            }
        }
        dp[idx] = false;
        return false;
    }

    public static boolean canJump2(int[] nums){
        int n = nums.length;
        boolean[] dp = new boolean[n];

        dp[n - 1] = true;

        for(int i = n - 2; i >= 0; i--) {
            for(int j = 1; j <= nums[i] && i + j < n; j++) {
                if(dp[i + j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[0];

    }

    public static boolean canJump3(int[] nums) {
        int n = nums.length;
        int lastGoodIndex = n - 1;

        for(int i = n - 2; i >= 0; i--) {
            if(i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }

        return lastGoodIndex == 0;
    }


    public static void main(String[] args){
        int[] nums = {2, 0, 0, 1};

        System.out.println(canJump1(nums));
    }
}
