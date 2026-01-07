import java.util.HashMap;

public class maxConsecutives3_1004 {
    public static void main(String[] args){
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums, 2));
    }

    public static int longestOnes(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        map.put(1, 0);
        map.put(0, 0);

        for(int right = 0; right < nums.length; right++){
            int num = nums[right];

            map.put(num, map.get(num) + 1);

            while(map.get(0) > k){
                int leftNum = nums[left];
                map.put(leftNum, map.get(leftNum) - 1);
                left++;
            }

            maxLength = Math.max(right-left + 1, maxLength);
        }
        return maxLength;
    }
}
