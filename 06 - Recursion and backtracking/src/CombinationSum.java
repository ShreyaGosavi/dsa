import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args){

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> one = new ArrayList<Integer>();
        return helper(one, candidates, target, 0, 0);
    }

    private static List<List<Integer>> helper(List<Integer> one, int[] candidates, int target, int i, int sum) {
        if(sum == target){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(one));
            return ans;
        }

        if (sum > target || i == candidates.length){
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        one.add(candidates[i]);
        result.addAll(helper(one, candidates, target, i + 1, sum + candidates[i]));
        one.remove(one.size() - 1);//one.removeLast() also works;

        result.addAll(helper(one, candidates, target, i + 1, sum));

        return result;
    }
}
