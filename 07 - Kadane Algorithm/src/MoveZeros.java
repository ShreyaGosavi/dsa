import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int insertat = 0;

        //moving all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertat] = nums[i];
                insertat++;
            }
        }

        //filling remaining positions with zero
        while (insertat < nums.length) {
            nums[insertat] = 0;
            insertat++;
        }
    }
}
