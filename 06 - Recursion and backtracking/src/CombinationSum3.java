import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args){

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> one = new ArrayList<>();
        return helper(n, k, one, 0, 1);
    }

    private List<List<Integer>> helper(int n, int k, List<Integer> one, int sum, int i) {
        //base conditions
        if(sum < n && one.size() == k){
            return new ArrayList<>();
        }

        if(sum == n && one.size() == k){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(one));
            return ans;
        }

        if(i == 10){
            return  new ArrayList<>();
        }


        List<List<Integer>> result = new ArrayList<>();

        //take
        one.add(i);
        result.addAll(helper(n, k, one, sum + i, i + 1));
        one.remove(one.size() - 1);

        result.addAll(helper(n, k, one, sum, i + 1));

        return result;
    }


}
