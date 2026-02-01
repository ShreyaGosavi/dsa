import java.util.ArrayList;
import java.util.List;

public class DisappearedNumberInArray_448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;

        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] <= nums.length && i != correct){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            i++;
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                ans.add(index+1);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
