import java.util.Arrays;

public class MaximumSubArray2 {
    public static void main(String[] args){
        int[]  nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(maxSubArray(nums)));

    }

    public static int[] maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        int start = -1;
        int ansStart = -1;
        int ansEnd = -1;

        for(int i = 0; i < nums.length; i++){
            if(sum == 0){
                start = i;
            }
            sum = sum + nums[i];

            if(sum > max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return new int[]{ansStart, ansEnd, max};
    }
}
