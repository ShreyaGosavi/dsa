import java.util.HashMap;

public class SubArraySumDivK_974 {
    public static void main(String[] args){

    }

    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //this map first stored if we have seen the sum already and if yes toh how many times
        map.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        int remainder = 0;
        for(int num: nums){
            prefixSum += num;

            remainder = prefixSum % k;
            if (remainder < 0) {
                remainder += k;
            }

            if(map.containsKey(remainder)){
                count += map.get(remainder);
            }

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
