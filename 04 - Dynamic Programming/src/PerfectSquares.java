import java.util.Arrays;
public class PerfectSquares {
    public static void main(String[] args){
        int closestSquare = (int) Math.sqrt(12);
        System.out.println(closestSquare);
    }

    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        return helper(n, dp);
    }

    public static int helper(int n, int[] dp){
        if (dp[n] != -1) return dp[n];

        int root = (int)Math.sqrt(n);
        int best = Integer.MAX_VALUE;

        for (int s = root; s >= 1; s--) {

            int square = s * s;
            int remainder = n - square;

            int candidate;
            if (dp[remainder] != -1) {
                candidate = 1 + dp[remainder];
            } else {
                candidate = 1 + helper(remainder, dp);
            }

            best = Math.min(best, candidate);
        }

        dp[n] = best;
        return best;
    }

    public static int numSquares2(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 0;

        // fill dp table
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;

            for (int s = 1; s * s <= i; s++) {
                int square = s * s;
                dp[i] = Math.min(dp[i], 1 + dp[i - square]);
            }
        }

        return dp[n];
    }

}
