import trees.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryPostOrder {

    public List<Integer> postorder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        for(Node child: root.children){
            result.addAll(postorder(child));
        }
        result.add(root.val);

        return result;
    }
}
