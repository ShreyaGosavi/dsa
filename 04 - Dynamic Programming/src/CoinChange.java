import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args){

    }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return helper(coins, amount, dp);
    }


    public static int helper(int[] coins, int amount, int[] dp){
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        if (dp[amount] != -1) return dp[amount];

        int min = Integer.MAX_VALUE;

        // Try every coin
        for (int i = coins.length - 1; i >= 0; i--) {
            int res = helper(coins, amount - coins[i], dp);

            if (res != -1) {
                min = Math.min(min, 1 + res);
            }
        }

        dp[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
        return dp[amount];
    }
}
