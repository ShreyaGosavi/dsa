import trees.TreeNode;

public class LcsDeepestLeaves_1123 {
    private static class Result {
        TreeNode node;
        int depth;

        Result(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return helper(root, 0).node;
    }

    private Result helper(TreeNode root, int depth) {
        if (root == null) {
            return new Result(null, depth);
        }

        Result left = helper(root.left, depth + 1);
        Result right = helper(root.right, depth + 1);

        // If left subtree is deeper
        if (left.depth > right.depth) {
            return left;
        }

        // If right subtree is deeper
        if (right.depth > left.depth) {
            return right;
        }

        // Depths are equal → current node is LCA
        return new Result(root, left.depth);
    }
}
