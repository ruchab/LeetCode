package Tree;

import java.util.Stack;

/**
 * Created by Rucha on 7/11/15.
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * Calling next() will return the next smallest number in the BST.
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 */

public class BSTIterator {

    private Stack<TreeNode> stack;
    private TreeNode currentNode;
    public BSTIterator(TreeNode root) {
      stack = new Stack<TreeNode>();
      currentNode = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (!stack.isEmpty() || currentNode!=null);
    }

    /** @return the next smallest number */
    public int next() {
     TreeNode next = null;
        //find leftmost with no child
        while (currentNode!=null){
            stack.push(currentNode);
            currentNode = currentNode.left;
    }
        if(!stack.isEmpty()){
            next = stack.pop();
            currentNode = next.right;
        }
        return next.val;
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
}
