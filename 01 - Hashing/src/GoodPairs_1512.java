import java.util.HashMap;

public class GoodPairs_1512 {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1, 1, 3};

        int result = numIdenticalPairs(nums);
        System.out.println("Number of good pairs: " + result);
    }

    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            count += freq.getOrDefault(num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
