package Tree;

/**
 * Created by Rucha on 7/11/15.
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthofBinaryTree {
//Max depth is nothing but the height of the binary tree
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left==null && root.right==null) return 1;
        else{
            return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
        }
    }
}
