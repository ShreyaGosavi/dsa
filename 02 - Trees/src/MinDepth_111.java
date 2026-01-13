import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import trees.TreeNode;
public class MinDepth_111 {
    public int minDepth(TreeNode root) {
        int result = 0;

        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            result++;

            for(int i = 0; i < levelSize; i++){

                TreeNode currentNode = queue.poll();

                if(currentNode.left == null && currentNode.right == null){
                    return result;
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }
}
