import java.util.List;
import java.util.ArrayList;
public class Permutations {
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> one = new ArrayList<>();
        return helper(nums, one, 0);
    }

    public static List<List<Integer>> helper(int[] nums, List<Integer> one, int level){
        if(level == nums.length){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(one));
            return ans;
        }

        List<List<Integer>> result = new ArrayList<>();



        for(int i = 0; i <= one.size(); i++){

            if(i > 0 && one.get(i-1) == nums[level]) continue;

            one.add(i, nums[level]);
            result.addAll(helper(nums, one, level+1));
            one.remove(i);
        }
        return result;
    }
}
