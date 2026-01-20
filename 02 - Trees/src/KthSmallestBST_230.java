import trees.TreeNode;

public class KthSmallestBST_230 {

    int count = 0;
    public TreeNode helper(TreeNode root, int k) {
        if(root == null){
            return null;
        }

         TreeNode left = helper(root.left,k);

        if(left != null){
            return left;
        }

        if(count == k){
            return null;
        }

        return helper(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }
}
