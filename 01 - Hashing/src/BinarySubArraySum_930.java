import java.util.HashMap;

public class BinarySubArraySum_930 {
    public static void main(String[] args){

    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for(int num: nums){
            prefixSum += num;

            int difference = prefixSum - goal;

            if(map.containsKey(difference)){
                count += map.get(difference);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
