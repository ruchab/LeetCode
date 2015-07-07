package Math;

/**
 * Created by Rucha on 7/5/15.
 * Given an integer, write a function to determine if it is a power of two.
 * Power of 2 means only one bit of n is '1', so use the trick n&(n-1)==0 to judge whether that is the case
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if((n&(n-1)) == 0) return true;
        else return false;
    }
}


