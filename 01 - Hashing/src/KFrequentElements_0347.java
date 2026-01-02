import java.util.HashMap;
import java.util.PriorityQueue;

public class KFrequentElements_0347 {
    public static void main(String[] args){

    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min heap of size k (stores {num, frequency})
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> a[1] - b[1]   // sort by frequency (smallest at top)
        );

        // Step 3: Push elements into min-heap
        for (int n : freq.keySet()) {
            minHeap.add(new int[]{n, freq.get(n)});  // push (number, frequency)

            if (minHeap.size() > k) {
                minHeap.poll(); // remove the least frequent element
            }
        }

        // Step 4: Build the result
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll()[0]; // extract elements from heap
        }

        return result;
    }
}
