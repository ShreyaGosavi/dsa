import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class IncreasingSubsequences {
    public static void main(String[] args){

    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> p = new ArrayList<>();
        return helper(p, nums, 0);
    }


    public static List<List<Integer>> helper(List<Integer> p, int[] up, int i){
        if(i == up.length && p.size() >= 2){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(p));
            return ans;
        }
        if(i == up.length && p.size() < 2){
            return new ArrayList<>();
        }

        int element = up[i];

        p.add(element);
        while(i + 1 < up.length && up[i+1] < up[i]){
            i++;
        }
        List<List<Integer>> left = helper(p, up, i + 1);

        p.removeLast();
        while(i + 1 < up.length && up[i+1] < up[i]){
            i++;
        }
        List<List<Integer>> right = helper(p, up, i + 1);

        left.addAll(right);
        return left;
    }
}
