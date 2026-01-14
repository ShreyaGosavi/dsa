import trees.TreeNode;

import java.util.*;

public class EvenOddTree_1609 {

    public boolean isEvenOddTree(TreeNode root) {
        if(root == null){
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isEven = false;

        while(!queue.isEmpty()){
            isEven = !isEven;
            int levelSize = queue.size();

            if(isEven){
                int largest = Integer.MIN_VALUE;
                for(int i = 0; i < levelSize; i++){
                    TreeNode currentNode = queue.poll();

                    if(currentNode.val % 2 != 0){
                        if(currentNode.val > largest){
                            largest = currentNode.val;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                    }

                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
            }
            else{
                int smallest = Integer.MAX_VALUE;
                for(int i = 0; i < levelSize; i++){
                    TreeNode currentNode = queue.poll();

                    if(currentNode.val % 2 == 0){
                        if(currentNode.val < smallest){
                            smallest = currentNode.val;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        return false;
                    }

                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
            }
        }
        return true;
    }
}
