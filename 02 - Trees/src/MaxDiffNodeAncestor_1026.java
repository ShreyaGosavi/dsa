import trees.TreeNode;

public class MaxDiffNodeAncestor_1026 {
    int maxDiff = 0;

    public int maxAncestorDiff(TreeNode root) {
        helper(root, root.val, root.val);
        return maxDiff;
    }

    public void helper(TreeNode root, int minValue, int maxValue){
        if(root == null){
            return;
        }

        maxDiff = Math.max(maxDiff,
                Math.max(
                        Math.abs(root.val - minValue),
                        Math.abs(root.val - maxValue)
                ));

        minValue = Math.min(minValue, root.val);
        maxValue = Math.max(maxValue, root.val);

        helper(root.left, minValue, maxValue);
        helper(root.right, minValue, maxValue);
    }
}
