import trees.TreeNode;

public class BinaryTreeTilt_563 {

    private int sum = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);

        int ans = Math.abs(left - right);
        sum += ans;

        return left + right + root.val;
    }
}
