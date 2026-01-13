import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import trees.TreeNode;

public class LargestValueInLevel_515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int largest = Integer.MIN_VALUE;

            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                largest = Math.max(currentNode.val, largest);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(largest);
        }
        return result;
    }
}
