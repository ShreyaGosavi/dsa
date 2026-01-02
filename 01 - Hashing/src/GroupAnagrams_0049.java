import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams_0049 {
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

//    char[] arr = s.toCharArray();
//    Arrays.sort(arr);
//    String sorted = new String(arr);
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sorted = new String(s);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }


}
