import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args){

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> p = new ArrayList<>();
        return helper(p, nums, 0);
    }

    public static List<List<Integer>> helper(List<Integer> p, int[] up, int i){
        if(i == up.length){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(p));
            return ans;
        }

        int element = up[i];

        p.add(element);
        List<List<Integer>> left = helper(p, up, i + 1);

        while(i + 1 < up.length && up[i+1] == up[i]){
            i++;
        }

        p.removeLast();
        List<List<Integer>> right = helper(p, up, i + 1);

        left.addAll(right);
        return left;
    }
}

