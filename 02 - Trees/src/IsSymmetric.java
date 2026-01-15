import trees.TreeNode;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(TreeNode leftSub, TreeNode rightSub) {

        if (leftSub == null && rightSub == null)
            return true;

        // One of them is null, so they aren't mirror images
        if (leftSub == null || rightSub == null
                || leftSub.val != rightSub.val)
            return false;

        // Check if the subtrees are mirrors
        return isMirror(leftSub.left, rightSub.right)
                && isMirror(leftSub.right, rightSub.left);
    }
}
