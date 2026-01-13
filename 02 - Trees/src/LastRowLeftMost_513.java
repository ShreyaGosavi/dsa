import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import trees.TreeNode;
public class LastRowLeftMost_513 {
    public int findBottomLeftValue(TreeNode root) {
        int leftMost = -1;

        if(root == null){
            return leftMost;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();


            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();

                if(i == 0){
                    leftMost = currentNode.val;
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return leftMost;
    }
}
