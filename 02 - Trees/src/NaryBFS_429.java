import trees.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryBFS_429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for(int i = 0; i < levelSize; i++){
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                for(int j = 0; j < currentNode.children.size(); j++){
                    queue.offer(currentNode.children.get(j));
                }
            }

            result.add(currentLevel);
        }
        return result;
    }
}
