public class ExactlyKOdd_1248 {
    public static void main(String[] args){

    }

    public static int numberOfSubarrays(int[] nums, int k) {
        return atMostKOdd(nums, k) - atMostKOdd(nums, k-1);
    }

    public static int atMostKOdd(int[] nums, int k){
        int left = 0;
        int currOddCount = 0;
        int count = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 != 0){
                currOddCount += 1;
            }

            while(currOddCount > k){
                if(nums[left] % 2 != 0){
                    currOddCount -= 1;
                }
                left++;
            }

            count +=(right - left + 1);
        }
        return count;
    }
}
