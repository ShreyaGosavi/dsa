import trees.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevels_637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double currentLevelSum = 0;

            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                currentLevelSum += currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevelSum/levelSize);
        }
        return result;
    }
}
