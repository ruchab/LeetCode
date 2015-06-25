package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Rucha on 6/21/15.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            int l= i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum==0){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    if(!set.contains(temp)){
                        triplets.add(temp);
                        set.add(temp);
                    }
                    l++;
                    r--;
                }else if (sum >0){
                    r--;
                }else {
                    l++;
                }

            }
        }

        return triplets;

    }
}
