public class LongestPalindromicSubString_05 {
    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty()){
            return "";
        }

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++) {

            int len1 = Length(s, i, i);
            int len2 = Length(s, i, i + 1);

            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int Length(String str, int s, int e){
        while(s >= 0 && e < str.length()
                && str.charAt(s) == str.charAt(e)){
            s--;
            e++;
        }

        return e - s - 1;
    }


    public String longestPalindrome1(String s) {
        int n = s.length();
        if (n <= 1) {
            return s;
        }

        int start = 0;
        int maxLen = 1;

        boolean[][] dp = new boolean[n][n];

        // length = 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // length = 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }

        // length >= 3
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {

                int j = i + len - 1;

                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;

                    if (len > maxLen) {
                        start = i;
                        maxLen = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

}
