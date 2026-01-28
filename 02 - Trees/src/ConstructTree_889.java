import trees.TreeNode;

import java.util.Arrays;

public class ConstructTree_889 {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if (preorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        // single node
        if (preorder.length == 1) {
            return root;
        }

        // preorder[1] is left child root
        int leftRootVal = preorder[1];
        int index = 0;

        // find left subtree end in postorder
        for (int i = 0; i < postorder.length; i++) {
            if (postorder[i] == leftRootVal) {
                index = i;
                break;
            }
        }

        int leftSize = index + 1;

        root.left = constructFromPrePost(
                Arrays.copyOfRange(preorder, 1, 1 + leftSize),
                Arrays.copyOfRange(postorder, 0, leftSize)
        );

        root.right = constructFromPrePost(
                Arrays.copyOfRange(preorder, 1 + leftSize, preorder.length),
                Arrays.copyOfRange(postorder, leftSize, postorder.length - 1)
        );

        return root;
    }

}
