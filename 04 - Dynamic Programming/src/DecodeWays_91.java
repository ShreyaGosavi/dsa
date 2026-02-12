import java.util.Arrays;

public class DecodeWays_91 {
    public static int numDecodings(String s) {
        int i = 0;

        char[] arr = s.toCharArray();
        return helper(arr, i);
    }

    public static int helper(char[] arr, int i){
        if(i == arr.length){
            return +1;
        }//reached end successfully

        if(arr[i] == '0'){
            return 0; //start pe no zero
        }

        int ways = helper(arr, i+1); //take 1

        if (i + 1 < arr.length) { //take 2 only if no leading 0 and not exceeding 26
            int num = (arr[i] - '0') * 10 + (arr[i + 1] - '0');
            if (num >= 10 && num <= 26) {
                ways += helper(arr, i + 2);
            }
        }

        return ways;
    }


    public static int numDecodings2(String s) {
        int i = 0;

        char[] arr = s.toCharArray();
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return helper1(arr, i, dp);
    }

    public static int helper1(char[] arr, int i, int[] dp){
        if(i == arr.length){
            return +1;
        }//reached end successfully

        if(dp[i] != -1){
            return dp[i];
        }

        if(arr[i] == '0'){
            return 0; //start pe no zero
        }

        int ways = helper1(arr, i+1, dp); //take 1

        if (i + 1 < arr.length) { //take 2 only if no leading 0 and not exceeding 26
            int num = (arr[i] - '0') * 10 + (arr[i + 1] - '0');
            if (num >= 10 && num <= 26) {
                ways += helper1(arr, i + 2, dp);
            }
        }
        dp[i] = ways;
        return ways;
    }
}
