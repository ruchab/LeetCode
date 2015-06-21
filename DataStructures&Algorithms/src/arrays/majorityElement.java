package arrays;

import java.util.HashMap;

/**
 * Created by Rucha on 6/20/15.
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class majorityElement {

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5};
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] num) {
        if(num.length==1)
            return num[0];

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i< num.length;i++){
            if(map.containsKey(num[i])){
                map.put(num[i],map.get(num[i]) + 1);
            }
            else{
                map.put(num[i],1);
            }

        }

        //int max = 0;
        int major=0;
        for(Integer k : map.keySet()){
            int val = map.get(k);
            if(val > num.length/2){
                major = k;
            }
        }

        return major;

    }

}