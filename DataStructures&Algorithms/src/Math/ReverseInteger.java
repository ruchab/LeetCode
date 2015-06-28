package Math;

/**
 * Created by Rucha on 6/27/15.
 * 1.What happens when the last digit of number is 0. 10,100
 * 2.when the input is a 32 bit integer then the reverse overflows.
 *   when it overflows return 0
 *   To check for overflow/underflow, we could check if ret > 214748364 or ret < –214748364
 *   before multiplying by 10. On the other hand, we do not need to check if ret == 214748364,
 */
public class ReverseInteger {


    public static void main(String[] args){

        System.out.print(reverse(-1123));
    }

    public static int reverse(int x) {
        long result =0;
        while(x != 0)
        {
            result = (result*10) + (x%10);
            if(result > Integer.MAX_VALUE) return 0;
            if(result < Integer.MIN_VALUE) return 0;
            x = x/10;
        }
        return (int)result;

    }
}
