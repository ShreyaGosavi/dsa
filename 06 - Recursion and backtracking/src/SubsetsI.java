import java.util.List;
import java.util.ArrayList;
public class SubsetsI {
    public static void main(String[] args){
        int[] nums = {1, 2, 3};
        List<List<Integer>> answer = subsets(nums);
        System.out.println(answer);
    }

    public static List<List<Integer>> subsets(int[] nums){
        List<Integer> p = new ArrayList<Integer>();
        return helper(p, nums, 0);
    }

    public static List<List<Integer>> helper(List<Integer> p, int[] up, int i){
        if(i == up.length){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(p));
            return ans;
        }
        int element = up[i];

        //take in
        p.add(element);
        List<List<Integer>> left = helper(p, up, i + 1);

        //neglect
        p.removeLast();
        List<List<Integer>> right = helper(p, up, i + 1);

        left.addAll(right);
        return left;

    }

}
