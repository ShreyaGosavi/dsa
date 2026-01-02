import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharFreq_0451 {
    public static void main(String[] args){
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(map.entrySet());

        StringBuilder result = new StringBuilder();

        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }


}
