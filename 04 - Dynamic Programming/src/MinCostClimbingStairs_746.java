import java.util.Arrays;

public class MinCostClimbingStairs_746 {
    public static int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost, 0), helper(cost, 1));
    }

    public static int helper(int[] cost, int pos) {
        if (pos >= cost.length) {
            return 0;
        }

        return cost[pos] + Math.min(
                helper(cost, pos + 1),
                helper(cost, pos + 2)
        );
    }


    public static int minCostClimbStairs2(int[] cost){
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(helper2(cost, 0,dp), helper2(cost, 1, dp));
    }

    private static int helper2(int[] cost, int i, int[] dp) {
        if (i >= cost.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int one = helper2(cost, i + 1, dp);
        int two = helper2(cost, i + 2, dp);

        dp[i] = cost[i] + Math.min(one, two);
        return dp[i];
    }

    public int minCostClimbingStairs3(int[] cost) {
        int n = cost.length;

        if (n == 1) return cost[0];
        if (n == 2) return Math.min(cost[0], cost[1]);

        int[] dp = new int[n];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public int minCostClimbingStairs4(int[] cost) {
        int n = cost.length;

        if (n == 1) return cost[0];
        if (n == 2) return Math.min(cost[0], cost[1]);

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < n; i++) {
            int curr = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = curr;
        }

        return Math.min(prev1, prev2);
    }

    public static void main(String[] args){
        int[] cost = {1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCostClimbingStairs(cost));
    }
}
