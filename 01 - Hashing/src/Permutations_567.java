import java.util.HashMap;

public class Permutations_567 {
    public static void main(String[] args){
        String s1 = "bae";
        String s2 = "eidboaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        //Hasmap for the original frequency mapping
        HashMap<Character, Integer> map = new HashMap<>();

        //frequency mapping the ideal p
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int l = 0;
        int len = s1.length();
        //scanning the s
        for(int r = 0; r < s2.length(); r++){
            char ch = s2.charAt(r);

            if(map.containsKey(ch)){
                if(map.get(ch) > 0){
                    len--;
                }
                map.put(ch, map.getOrDefault(ch, 0) - 1);//this is not inside coz irrespective of freq we have to reduce it
            }


            if((r - l + 1) > s1.length()){
                char lch = s2.charAt(l);
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
                return true;
            }
        }
        return false;
    }
}
