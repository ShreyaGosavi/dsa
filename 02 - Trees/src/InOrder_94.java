import java.util.ArrayList;
import java.util.List;
import trees.TreeNode;

public class InOrder_94 {
    public static void main(String[] args){

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));

        return result;
    }
}
