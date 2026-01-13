import trees.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth_104 {
    public int maxDepth(TreeNode root) {
        int result = 0;

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result++;
        }
        return result;
    }
}
