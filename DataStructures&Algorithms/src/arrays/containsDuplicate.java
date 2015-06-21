package arrays;

import java.util.HashMap;

/**
 * Created by Rucha on 6/20/15.
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class containsDuplicate {

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.print(containsDuplicate(a));
    }

    public static boolean containsDuplicate(int[] a){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                return true;
            }
            else{
                map.put(a[i],1);
            }
        }
        return false;
    }
}
