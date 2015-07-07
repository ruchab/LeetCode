package BitManipulation;

/**
 * Created by Rucha on 7/4/15.
 */
public class NumberOf1Bits {

    public static void main(String[] args) {
        System.out.println(hammingWeight(4));
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count=0;

        while(n!=0){
            count += (n&1);
            n = n>>>1;
        }
        return count;
    }
}
