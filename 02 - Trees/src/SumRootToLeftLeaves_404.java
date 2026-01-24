import trees.TreeNode;

public class SumRootToLeftLeaves_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return helper(root);
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += helper(root.left);
            }
        }

        sum += helper(root.right);

        return sum;
    }
}
