import java.util.HashMap;

public class ContinuousSubArraySum_523 {
    public static void main(String[] args){

    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  //dont know but gave error without this

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];
            int remainder = prefixSum % k;

            if (remainder < 0) {
                remainder += k;
            }

            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                // store FIRST index only
                map.put(remainder, i);
            }
        }

        return false;
    }
}
