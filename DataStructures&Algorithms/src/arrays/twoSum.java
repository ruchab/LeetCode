package arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Rucha on 6/21/15.
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 The function twoSum should return indices of the two numbers such that they add up to the target,
 where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 You may assume that each input would have exactly one solution.
 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 */
public class twoSum {

    public static void main (String[] args){
        int[] n = {1,2,3,4,5,6,7};
        int target = 3;
        int[] result = new int[2];
        result = twoSum(n,target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                result[0] = map.get(numbers[i]);
                result[1] = i+1;
            }else{
                map.put(target-numbers[i],i+1); //non zero based index
            }
        }
        return result;
    }

    //Brute Force
    public static int[] twoSumBrute(int[] numbers, int target){
        int[] result = new int[2];
        for(int i=0;i< numbers.length-1;i++){
            for (int j =i+1;j<numbers.length;j++){
                if(numbers[i] + numbers[j] == target){
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }
        return result;
    }

}
