package arrays;

/**
 * Created by Rucha on 7/11/15.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int product =1;
        int max_product=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            product *= nums[i];
            max_product = Math.max(product,max_product);
            if(product==0) product=1;
        }

        product=1;
        for(int i = nums.length-1;i>=0;i--){
            product *= nums[i];
            max_product = Math.max(product,max_product);
            if(product==0) product=1;
        }

        return max_product;
    }
}
