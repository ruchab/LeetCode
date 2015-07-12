package Greedy;

/**
 * 400 ms
 * Created by Rucha on 7/11/15.
 * Algorithm: greedy.
 All nodes with in jumping range can be used as stepping stones. Take the stepping stone which can help you reach farther.

 Example:
 A = [2,3,1,1,4,0,1]

 At A[0], can jump at most 2, so A[1], A[2]  are all possible intermediate stepping stone
 If take A[1] as stepping stone, at most can jump to A[4]; If take A[2], at most can jump to A[3]; So take A[1] as stepping point and jump to A[4] ; [Greedy]
 At A[4], can jump at most 4, so A[5], A[6] are all in jumping range. Can Reach the end;
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        if(nums.length<=1) return true;
        int index=0;
        int endindex=0;
        while(index<=endindex){
            endindex = Math.max(endindex,index+nums[index]); //greedy take the best stepping stone
            if(endindex >= nums.length-1) //if endindex is at the end of the nums means result is true;
                return true;
            index++;
        }
        return false;
    }
}
