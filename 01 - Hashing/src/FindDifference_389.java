/*
Problem no: 389 - easy
time complexity: o(s + t) worst case
space complexity: o(s)
 */
import java.util.HashMap;

public class FindDifference_389 {
    public static void main(String[] args){
        String s = "abcd";
        String t = "abacd";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i = 0; i < t.length(); i++){
            if (map.getOrDefault(t.charAt(i), 0) > 0) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
            else{
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
