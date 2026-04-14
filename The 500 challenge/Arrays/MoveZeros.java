public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int valid = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[valid] = nums[i];
                if(valid != 0){
                    nums[i] = 0;
                }
                valid++;
            }
        }

    }

}
// ulta socho -> move zeros does not mean u should move zeros but u can move non zeros in a way that zeros come to an end
