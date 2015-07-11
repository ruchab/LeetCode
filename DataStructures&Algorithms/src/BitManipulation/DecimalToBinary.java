package BitManipulation;

/**
 * Created by Rucha on 7/4/15.
 * Repeatedly divide the number by 2 till the quotient is 0
 * concatenate all the remainders last one being MSB
 * n is always positive
 *
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.print("Binary::" + toBinaryBitwise(2));
    }

    public String toBinary(int n){
        if(n<=1) return Integer.toString(n);
        String result="";
        while(n>0){
            int rem = n%2;
            result = rem + result;
            n =n/2;
        }

        return result;
    }

    //Bitwise operation

    public static String toBinaryBitwise(int n){

        
        if(n<=1) return Integer.toString(n);
        String result="";
        while(n>0){
            System.out.println("be"+n);
             result = (n & 1) + result;
            System.out.println("r" +result);
            n = n >> 1;
            System.out.println("af"+n);
        }
        return result;
    }

}
