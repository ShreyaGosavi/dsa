import trees.TreeNode;
import java.util.*;

import static java.lang.Integer.parseInt;

public class DeserializeBT_297 {

    public TreeNode deserialize(String data) {
        List<String> stringList = Arrays.asList(data.split(","));
        Collections.reverse(stringList);

        return helper(stringList);

    }

    public TreeNode helper(List<String> data){
        String val = data.removeLast();

        if(val.equals("null")){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper(data);
        node.right = helper(data);

        return node;
    }
}
