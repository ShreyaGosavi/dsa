import trees.TreeNode;

public class Flatten_114 {

    public void flatten(TreeNode root) {
        if (root == null) return;

        // Flatten left and right subtrees
        flatten(root.left);
        flatten(root.right);

        // Store left and right subtrees
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Move left subtree to the right
        root.left = null;
        root.right = left;

        // Find the tail of the new right subtree
        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }

        // Attach the original right subtree
        curr.right = right;

    }
}
