import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2_113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> p = new ArrayList<>();

        return helper(root, targetSum, p);
    }


    public List<List<Integer>> helper(TreeNode root, int remaining, List<Integer> p){
        if(root == null){
            return new ArrayList<>();
        }

        remaining = remaining - root.val;
        p.add(root.val);

        List<List<Integer>> result = new ArrayList<>();

        if (root.left == null && root.right == null && remaining == 0) {
            result.add(new ArrayList<>(p));
        } else {
            // explore
            result.addAll(helper(root.left, remaining, p));
            result.addAll(helper(root.right, remaining, p));
        }
        p.removeLast();

        return result;

    }
}
