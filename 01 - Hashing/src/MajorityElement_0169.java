import java.util.HashMap;
public class MajorityElement_0169 {
    public static void main(String[] args){
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int max = 0;
        int num = nums[0];

        for(int i : nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(int j = 0; j < nums.length; j++){

            if(freqMap.get(nums[j]) > max){
                max = freqMap.get(nums[j]);
                num = nums[j];
            }
        }
        return num;
    }


//    HashMap<Integer, Integer> freqMap = new HashMap<>();
//    int max = 0;
//    int num = nums[0];
//
//for (int x : nums) {
//        int count = freqMap.getOrDefault(x, 0) + 1;
//        freqMap.put(x, count);
//
//        if (count > max) {
//            max = count;
//            num = x;
//        }
//    }
//return num;
}
