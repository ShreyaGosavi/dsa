import java.util.HashSet;

public class MaxLengthVowels_1456 {
    public static void main(String[] args){
        System.out.println(maxVowels("leetcode", 4));
    }
/*
Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.



Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
 */
    public static int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        int l = 0;
        int maxCount = 0;
        int curr = 0;

        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);
            if(vowels.contains(ch)){
                curr += 1;
            }

            if(r - l + 1 > k){
                char lch = s.charAt(l);
                if(vowels.contains(lch)){
                    curr -= 1;
                }
                l++;
            }
            maxCount = Math.max(curr, maxCount);
        }
        return maxCount;
    }
}
