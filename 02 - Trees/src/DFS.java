import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFS {

    public List<Integer> dfs(TreeNode root){
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            result.add(currentNode.val);

            if(currentNode.right != null){
                stack.add(currentNode.right);
            }
            if(currentNode.left != null){
                stack.add(currentNode.left);
            }
        }
        return result;
    }
    // recursive dfs is preorder traversal

}
