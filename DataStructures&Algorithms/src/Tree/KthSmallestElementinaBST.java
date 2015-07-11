package Tree;

import java.util.Stack;

/**
 * Created by Rucha on 7/11/15.
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 */
public class KthSmallestElementinaBST {

    ///do inorder traversal. and count while poppoing out of the stack.When count == k return
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode currentNode = root;
        int count=0;
        int result=0;
        while(!stack.isEmpty() || currentNode!=null){
            while(currentNode!=null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            if(!stack.isEmpty()){
                TreeNode nextNode = stack.pop();
                if(count == k){
                    result = nextNode.val;
                    break;
                }
                count++;
                currentNode = nextNode.right;
            }

        }
           return result;
    }
}

