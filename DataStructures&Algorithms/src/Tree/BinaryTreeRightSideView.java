package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Runtime: 332 ms
 * Created by Rucha on 7/11/15.
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 */
public class BinaryTreeRightSideView {

    //Level order traversal and take the last element of the queue
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root== null) return result;
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode temp = queue.poll();
                if(i == size-1){
                    result.add(temp.val);
                }
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
        }

        return result;
    }
}
