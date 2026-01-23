import trees.TreeNode;

public class lca2_1644 {
    private TreeNode lca = null;
    private int found = 0;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return found == 2 ? lca : null;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }

        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);

        boolean mid = (root == p || root == q);

        if (mid) {
            found++;
        }

        // LCA condition
        if ((mid && left) || (mid && right) || (left && right)) {
            if (lca == null) {
                lca = root;
            }
        }

        return mid || left || right;
    }
}
