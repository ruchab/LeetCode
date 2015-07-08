package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Rucha on 7/7/15.
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 */


// Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class BinaryTreeInorderTraversal {

    //Iterative
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        TreeNode currentNode = root;

        while(!stack.isEmpty() || currentNode !=null){
            while (currentNode!=null){
                stack.push(currentNode);
                currentNode = currentNode.left; //travel left most
            }

            if(!stack.isEmpty()){
                TreeNode next = stack.pop();
                result.add(next.val);
                currentNode = next.right;
            }
        }

        return result;
    }

    //Recursive
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inorderTraversalRecursiveHelper(root,result);
        return result;
    }

    public void inorderTraversalRecursiveHelper(TreeNode root,List<Integer>result){
        if(root == null) return;
        inorderTraversalRecursiveHelper(root.left,result);
        result.add(root.val);
        inorderTraversalRecursiveHelper(root.right,result);
    }
}
