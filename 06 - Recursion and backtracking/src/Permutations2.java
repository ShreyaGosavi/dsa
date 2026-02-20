import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);               // keep — makes generation deterministic
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

            // NEW: scan positions before i in `one`. If any equals nums[level],
            // it means inserting here would place the new value after an identical
            // value at this same recursion level → produces duplicate permutations.
            boolean skip = false;
            for (int j = 0; j < i; j++) {
                if (one.get(j) == nums[level]) { skip = true; break; }
            }
            if (skip) continue;

            one.add(i, nums[level]);
            result.addAll(helper(nums, one, level+1));
            one.remove(i);
        }
        return result;
    }

    // For quick local testing
    public static void main(String[] args) {
        int[] nums = {2,2,1,1};
        List<List<Integer>> res = permuteUnique(nums);
        System.out.println(res);
    }

}
