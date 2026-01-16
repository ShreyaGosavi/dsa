import trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth_662 {
    private static class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;


        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0L));

        int maxWidth = 0;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            long minNum = queue.peek().index;

            long first = 0;
            long last = 0;

            for(int i = 0; i < levelSize; i++){
                Pair current = queue.poll();
                long currentIndex = current.index - minNum;

                if(i == 0) first = currentIndex;
                if(i == levelSize - 1) last = currentIndex;

                if (current.node.left != null) {
                    queue.offer(new Pair(current.node.left, 2 * currentIndex + 1));
                }
                if (current.node.right != null) {
                    queue.offer(new Pair(current.node.right, 2 * currentIndex + 2));
                }
            }
            maxWidth = Math.max(maxWidth, (int)(last - first + 1));
        }
        return maxWidth;
    }
}
