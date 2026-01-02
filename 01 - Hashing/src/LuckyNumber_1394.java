import java.util.HashMap;
import java.util.Map;

public class LuckyNumber_1394 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        System.out.println(findLucky(arr));
    }


    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (key == value) {
                max = Math.max(max, key);
            }
        }

        return max;
    }

}
