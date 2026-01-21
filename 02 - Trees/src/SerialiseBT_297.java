import trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SerialiseBT_297 {

    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list);
        return String.join(", ", list);
    }

    public void helper(TreeNode root, List<String> list){
        if(root == null){
            list.add("null");
            return;
        }

        list.add(String.valueOf(root.val));

        helper(root.left, list);
        helper(root.right, list);
    }
}
