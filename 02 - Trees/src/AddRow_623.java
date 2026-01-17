import trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AddRow_623 {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int currentDepth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            if (currentDepth == depth - 1) {
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();

                    TreeNode oldLeft = node.left;
                    TreeNode oldRight = node.right;

                    node.left = new TreeNode(val);
                    node.right = new TreeNode(val);

                    node.left.left = oldLeft;
                    node.right.right = oldRight;
                }
                break; // very important
            }

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            currentDepth++;
        }

        return root;
    }

}
