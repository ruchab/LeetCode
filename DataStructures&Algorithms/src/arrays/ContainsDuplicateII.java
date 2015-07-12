package arrays;

import java.util.HashMap;

/**
 * Created by Rucha on 7/12/15.
 * Given an array of integers and an integer k, find out whether there there are two distinct
 * indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{

                if(i -map.get(nums[i]) <= k){
                    flag = true;
                }else{
                    map.put(nums[i],i);
                    flag = false;
                }
            }
        }
        return flag;
    }
}
