import java.util.HashMap;
import java.util.*;

public class ReduceArrayHalf {
    public static void main(String[] args){
        int[] arr = {7,7,7,7,7,7};
        System.out.println(minSetSize(arr));
    }

    public static int minSetSize(int[] arr) {
        int size = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(map.entrySet());

        int count = 0;
        while(size > arr.length/2){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            size -= entry.getValue();
            count += 1;
        }

        return count;
    }
}
