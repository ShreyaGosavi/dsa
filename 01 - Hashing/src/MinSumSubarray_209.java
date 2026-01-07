public class MinSumSubarray_209 {
    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];


            while (sum >= target) {
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
