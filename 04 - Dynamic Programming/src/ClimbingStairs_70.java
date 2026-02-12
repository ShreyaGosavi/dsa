public class ClimbingStairs_70 {
    public static int climbStairs1(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return climbStairs1(n-1) + climbStairs1(n-2);
    }

    public static int climbStairs2(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        return helper1(n, dp);
    }

    public static int helper1(int n, int[] dp){
        if(n == 0 || n == 1){
            return 1;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = helper1(n-1, dp) + helper1(n-2, dp);
        return dp[n];
    }

    public static int climbStairs3(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n+1; i++){
            dp[i] = dp[i -1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int climbStairs4(int n){
        if(n <= 1){
            return 1;
        }

        int one = 1;
        int two = 1;
        int ways = 0;

        for(int i = 2; i < n+1; i++){
            ways = one + two;
            one = two;
            two = ways;
        }
        return ways;
    }
}
