import trees.Node;
import java.util.LinkedList;
import java.util.Queue;

public class NaryMaxDepth_559 {
    public int maxDepth(Node root) {
        int result = 0;

        if(root == null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();


            for(int i = 0; i < levelSize; i++){
                Node currentNode = queue.poll();

                for(int j = 0; j < currentNode.children.size(); j++){
                    queue.offer(currentNode.children.get(j));
                }
            }

            result++;
        }
        return result;
    }
}
