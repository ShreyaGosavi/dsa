import trees.TreeNode;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;
public class ZigZagTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root);
        boolean rev = false;

        while(!deque.isEmpty()){
            int levelSize = deque.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            if(!rev){
                for(int i = 0; i < levelSize; i++){
                    TreeNode currentNode = deque.removeFirst();
                    currentLevel.add(currentNode.val);

                    if (currentNode.left != null) {
                        deque.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        deque.addLast(currentNode.right);
                    }
                }
            }
            else{
                for(int i = 0; i < levelSize; i++){
                    TreeNode currentNode = deque.removeLast();
                    currentLevel.add(currentNode.val);

                    if (currentNode.right != null) {
                        deque.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        deque.addFirst(currentNode.left);
                    }
                }
            }

            result.add(currentLevel);
            rev = !rev;
        }
        return result;
    }
}
