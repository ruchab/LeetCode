package arrays;

/**
 * Created by Rucha on 6/20/15.
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 Do not allocate extra space for another array, you must do this in place with constant memory.
 For example,
 Given input array nums = [1,1,2],
 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 */
public class removeDuplicates {

    public static void main(String[] args){
        int[] a = {1,1,2,2,3,3,4,4,5,5};
        System.out.println(removeDuplicates(a));
    }

    public static int removeDuplicates(int[] a){
        int count=0;
        for(int i =0 ;i<a.length;i++){
            if(count == 0 || a[i]!= a[count-1]){
                a[count] = a[i];
                count++;
            }
        }
        return count;
    }
}
