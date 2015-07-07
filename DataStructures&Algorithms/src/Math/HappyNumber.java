package Math;

import java.util.HashSet;

/**256 ms
 * Created by Rucha on 7/5/15.
 * Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 1^2 + 9^2 = 82
 8^2 + 2^2 = 68
 6^2 + 8^2 = 100
 1^2 + 0^2 + 0^2 = 1
 */
public class HappyNumber {

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<Integer>();

        while (!set.contains(n)){
            set.add(n);
            n = sum(getdigits(n));
            if(n == 1) return true;
        }
        return false;
    }

    public int sum(int[] arr){
        int sum=0;
        for(int i : arr){
            sum = sum + i*i;
        }
        return sum;
    }

    public int[] getdigits(int n){
        String s = ""+n;
        int[] arr = new int[s.length()];
        int i=0;
        while(n>0){
            int m = n%10;
            arr[i++] = m;
            n = n/10;
        }
        return arr;
    }
}
