import trees.TreeNode;

public class LongestSameValue_687 {
    private int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        helper(root);
        return max;
    }

    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);

        int leftPath = 0;
        int rightPath = 0;

        if (root.left != null && root.left.val == root.val) {
            leftPath = left + 1;
        }

        if (root.right != null && root.right.val == root.val) {
            rightPath = right + 1;
        }

        max = Math.max(max, leftPath + rightPath);

        return Math.max(leftPath, rightPath);

    }
}
