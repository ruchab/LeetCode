package Tree;

import java.util.*;

/**
 * Created by Rucha on 7/7/15.
 * Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 */


public class BinaryTreePostorderTraversal {

    //Recursive
    public List<Integer> postorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        postorderTraversalRecursiveHelper(root, result);
        return result;
    }

    public void postorderTraversalRecursiveHelper(TreeNode root,List<Integer> result){
        if(root == null) return;
        postorderTraversalRecursiveHelper(root.left,result);
        postorderTraversalRecursiveHelper(root.right,result);
        result.add(root.val);
    }

    //Iterative
    //modify preorder to make it root-right-left and then reverse it
    public List<Integer> postorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        TreeNode current = root;

        while (!stack.isEmpty() || current!=null){
            while (current!=null){
                stack.push(current);
                result.add(current.val);
                current = current.right;
            }

            if(!stack.isEmpty()){
                TreeNode next = stack.pop();
                current = next.left;
            }
        }

        Collections.reverse(result);

        return result;
    }
}
