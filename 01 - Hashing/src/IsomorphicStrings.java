import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args){
        String s = "badc";
        String t = "baba";

        System.out.println(isIsomorphic(s, t));

    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                map.put(s.charAt(i) , t.charAt(i));
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(reverseMap.containsKey(t.charAt(i))){
                if(reverseMap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            else{
                reverseMap.put(t.charAt(i) , s.charAt(i));
            }
        }
        return true;
    }
}
