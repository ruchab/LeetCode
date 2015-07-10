package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Rucha on 7/9/15.
 */
public class InvertBinaryTree {

    //Recursive
    public TreeNode invertTree(TreeNode root) {

        if(root!=null){
            invertTreeHelper(root);
        }
        return root;
    }

    public void invertTreeHelper(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left!=null){
            invertTreeHelper(root.left);
        }
        if(root.right!=null){
            invertTreeHelper(root.right);
        }
    }

    //Iterative

    public TreeNode invertTreeIterative(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root!=null)
            queue.add(root);

        while (!queue.isEmpty()){
            TreeNode p = queue.remove();
            if(p.left!=null){
                queue.add(p.left);
            }
            if(p.right!=null){
                queue.add(p.right);
            }

            TreeNode temp = p.left;
            p.left = p.right;
            p.right = temp;
        }

        return root;
    }
}
