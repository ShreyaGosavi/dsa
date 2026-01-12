import trees.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryPreOrder_589 {
    public List<Integer> preorder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        result.add(root.val);

        for(Node child: root.children){
            result.addAll(preorder(child));
        }

        return result;
    }
}
