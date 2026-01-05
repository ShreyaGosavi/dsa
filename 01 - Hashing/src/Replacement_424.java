public class Replacement_424 {
    public static void main(String[] args){

    }

    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            freq[idx]++;

            // track the frequency of the most common character in the window
            maxFreq = Math.max(maxFreq, freq[idx]);

            // if window becomes invalid, shrink from left
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
