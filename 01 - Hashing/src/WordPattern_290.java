import java.util.HashMap;

public class WordPattern_290 {
    public static void main(String[] args) {
        String s = "dog dog dog dog";
        String pattern = "abba";
        System.out.println(wordPattern(pattern, s));

    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // forward map check
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                map.put(ch, word);
            }

            // reverse map check
            if (reverseMap.containsKey(word)) {
                if (reverseMap.get(word) != ch) {
                    return false;
                }
            } else {
                reverseMap.put(word, ch);
            }
        }

        return true;
    }
}

