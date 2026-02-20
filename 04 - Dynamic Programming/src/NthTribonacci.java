import java.util.Arrays;
public class NthTribonacci {
    public static void main(String[] args){
        System.out.println(tribonacci2(25));
    }

    public static int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(dp, n);
    }

    public static int helper(int[] dp, int n){
        if(n <= 1){
            return n;
        }
        if(n == 2){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = helper(dp, n-1) + helper(dp, n-2) + helper(dp, n-3);
    }

    public static int tribonacci2(int n) {
        if(n <= 1){
            return n;
        }
        if(n == 2){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }

    public static int tribonacci3(int n){
        if(n <= 1){
            return n;
        }
        if(n == 2){
            return 1;
        }

        int a = 0, b = 1, c = 1;

        for(int i = 3; i < n+1; i++){
            int next = a + b + c;
            a = b;
            b = c;
            c = next;
        }
        return c;
    }

}
