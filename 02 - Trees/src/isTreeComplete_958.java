import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class isTreeComplete_958 {
    public boolean isCompleteTree(TreeNode root) {
        if(root == null){
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean seenNull = false;

        while(!queue.isEmpty()){
            int levelSize = queue.size();


            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();

                if(currentNode == null){
                    seenNull = true;
                }
                else{
                    if(seenNull) return false;
                }

                queue.offer(currentNode.left);
                queue.offer(currentNode.right);

            }
        }
        return true;
    }
}
