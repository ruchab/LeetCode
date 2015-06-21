package arrays;

/**
 * Created by Rucha on 6/21/15.
 */
public class searchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        if(nums[0]>target){
            return 0;
        }
      int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] > target){
                high = mid-1;
            }else
                low = mid+1;
        }
      return low;
    }
}
