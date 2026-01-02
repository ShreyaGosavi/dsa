public class SubArraySumEqualsK_0560 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(subarraySum(nums, 3));
    }
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        int i = 0;
        int start = 0;
        while(i <= nums.length - 1){
            sum += nums[i];

            if(sum == k){
                count += 1;
                sum = 0;
                start = i;
            }

            else if(sum < k){
                i++;
            }
            else{
                sum = 0;
                i = start + 1;
            }


        }
        return count;
    }
}
