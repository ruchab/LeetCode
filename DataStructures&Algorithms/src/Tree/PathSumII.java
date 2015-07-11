package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rucha on 7/11/15.
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * For example:
 * Given the below binary tree and sum = 22,
 */
public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null) return result;
        if(root.left==null && root.right==null){
            List<Integer> temp = new ArrayList<Integer>();
            if(root.val == sum){
                temp.add(root.val);
                result.add(temp);
            }
            return result;
        }

        int subSum = sum - root.val;

        for(List<Integer> list : pathSum(root.left,subSum)){
            list.add(0,root.val);
            result.add(list);
        }

        for(List<Integer> list : pathSum(root.right,subSum)){
            list.add(0,root.val);
            result.add(list);
        }

        return result;
    }
}
