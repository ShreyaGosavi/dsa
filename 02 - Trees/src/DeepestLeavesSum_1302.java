import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DeepestLeavesSum_1302 {
    public int deepestLeavesSum(TreeNode root) {

        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int sum = 0;

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            sum = 0;

            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                sum += currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return sum;
    }
}
