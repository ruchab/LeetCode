package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Rucha on 7/7/15.
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode current = root;

        while (!stack.isEmpty() || current!=null){

            while (current!=null){
                stack.push(current);
                result.add(current.val);
                current = current.left;
            }

            if(!stack.isEmpty()){
                TreeNode next = stack.pop();
                current = next.right;
            }
        }

        return result;
    }
}
