import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args){

    }

    public List<List<Integer>> combine(int k, int n) {
        List<Integer> one = new ArrayList<>();
        return helper(n, k, one, 1);
    }

    private List<List<Integer>> helper(int n, int k, List<Integer> one, int i) {
        //base conditions
        if(one.size() == k){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(one));
            return ans;
        }

        if(i == n+1){
            return  new ArrayList<>();
        }


        List<List<Integer>> result = new ArrayList<>();

        //take
        one.add(i);
        result.addAll(helper(n, k, one, i + 1));
        one.remove(one.size() - 1);

        result.addAll(helper(n, k, one, i + 1));

        return result;
    }
}
