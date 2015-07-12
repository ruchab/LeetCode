package arrays;

/**
 * Runtime: 324 ms
 * Created by Rucha on 7/11/15.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * MaxEndingHere is either A[i] plus the previous MaxEndingHere, or just A[i], whichever is larger.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int maxSoFar=nums[0];
        int maxEndingHere = nums[0];
        for(int i=1;i< nums.length;i++){
            maxEndingHere = Math.max(nums[i]+maxEndingHere,nums[i]);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }

        return maxSoFar;

    }


}
