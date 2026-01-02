/*
Problem no: 1207 - easy
time complexity: o(n) worst case
space complexity: o(n + seen)
 */
import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurences_1207 {
    public static void main(String[] args){
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> seen = new HashSet<>();

        for (int freq : map.values()) {
            if (!seen.add(freq)) {
                return false;
            }
        }

        return true;
    }
}
