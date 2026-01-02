/*
Problem no: 409 - easy
time complexity: o(s.length) worst case
space complexity: o(s.length)
 */
import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome_409 {
    public static void main(String[] args){
        String s = "aabbccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int odd = 0;

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();


            while(value % 2 != 0){
                value -= 1;
                odd += 1;
                if(odd == 1){
                    count += 1;
                }
            }
            count += value;
        }
        return count;
    }
}
