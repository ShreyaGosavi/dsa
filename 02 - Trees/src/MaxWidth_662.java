import trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth_662 {
    public int widthOfBinaryTree(TreeNode root) {

        if(root == null){
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int nextwidth = 2;
        int max = 0;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int width = nextwidth;

            TreeNode firstNode = null;
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                    if(firstNode == null){
                        firstNode = currentNode;
                    }
                }
                else{
                    if(firstNode == null){
                        width -= 1;
                    }

                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                    if(firstNode == null){
                        firstNode = currentNode;
                    }
                }
                else{
                    if(firstNode == null){
                        width -= 1;
                    }

                }

            }
            max = Math.max(width, max);
            nextwidth *= 2;
        }
        return max;
    }
}
