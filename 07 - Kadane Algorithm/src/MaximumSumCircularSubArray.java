public class MaximumSumCircularSubArray {
    public static void main(String[] args){

    }

    public static int maxSubarraySumCircular(int[] nums) {
        int total = 0; //sum of the entire array -> required when we do total - minSum
        int maxSum = Integer.MIN_VALUE;
        int currMaxSum = 0;
        int minSum = Integer.MAX_VALUE;
        int currMinSum = 0;

        for (int n: nums){
            total += n;

            //calculating min
            currMinSum = Math.min(n, currMinSum + n);
            minSum = Math.min(currMinSum, minSum);

            //calculating max
            currMaxSum = Math.max(n, currMaxSum + n);
            maxSum = Math.max(currMaxSum, maxSum);
        }

        if(maxSum < 0){
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }
}
