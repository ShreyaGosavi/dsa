import java.util.HashMap;

public class ShortestSubArrayK_862 {
    public static void main(String[] args){

    }

    public static int shortestSubarray(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        int currCount = 0;
        //number -> last seen
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];

            int need = prefixSum - k;

            while(prefixSum > k){
                if(map.containsKey(need)){
                    count = Math.min(count, i - map.get(need));
                }
            }

            map.put(prefixSum, i);
        }
        return count;
    }
}
