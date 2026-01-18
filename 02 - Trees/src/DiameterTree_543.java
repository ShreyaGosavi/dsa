import trees.TreeNode;


public class DiameterTree_543 {

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;

    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        int dia = left + right + 1;
        diameter = Math.max(diameter, dia);
        return Math.max(left, right) + 1;
    }
}
