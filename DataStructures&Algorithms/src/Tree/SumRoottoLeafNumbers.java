package Tree;

/**
 * Created by Rucha on 7/11/15.
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * Find the total sum of all root-to-leaf numbers.
 */
public class SumRoottoLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root,0);
    }

    public int sumNumbers(TreeNode root,int sum){
        if(root==null) return sum;
        int result = sum*10 + root.val;
        if(root.left==null && root.right==null){
            return result;
        }
        return (sumNumbers(root.left,result) + sumNumbers(root.right,result));
    }

}
