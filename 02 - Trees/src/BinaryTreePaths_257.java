import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new ArrayList<>();
        return helper(root, "");
    }

    public List<String> helper(TreeNode root, String p) {
        if (root.left == null && root.right == null) {
            return new ArrayList<>(List.of(p + root.val));
        }

        p = p + root.val + "->";

        List<String> result = new ArrayList<>();

        if (root.left != null) {
            result.addAll(helper(root.left, p));
        }

        if (root.right != null) {
            result.addAll(helper(root.right, p));
        }

        return result;
    }
}
