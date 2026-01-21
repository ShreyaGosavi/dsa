import trees.TreeNode;

public class Sum_129 {

    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }

        current = current * 10 + node.val;

        // Leaf node
        if (node.left == null && node.right == null) {
            return current;
        }

        return helper(node.left, current) + helper(node.right, current);
    }

}
