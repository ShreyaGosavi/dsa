import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllAnagrams_438 {
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        //for the result storing indexes of the start of anagrams
        List<Integer> result = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();

        //frequency mapping the ideal p
        for(int i = 0; i < p.length(); i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
        }
        int l = 0;
        int len = p.length();
        //scanning the s
        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);

            if(map.containsKey(ch)){
                if(map.get(ch) > 0){
                    len--;
                }
                map.put(ch, map.getOrDefault(ch, 0) - 1);//this is not inside coz irrespective of freq we have to reduce it
            }


            if((r - l + 1) > p.length()){
                char lch = s.charAt(l);
                if (map.containsKey(lch)) {
                    if (map.get(lch) >= 0) {
                        len++;
                    }
                    map.put(lch, map.get(lch) + 1);
                }
                l++;
            }

            // valid anagram
            if (len == 0) {
                result.add(l);
            }
        }
        return result;
   }
}
