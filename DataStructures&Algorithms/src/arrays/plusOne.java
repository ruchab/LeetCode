package arrays;

import java.util.Arrays;

/**
 * Created by Rucha on 6/29/15.
 */
public class plusOne {

    public static void main(String[] args){
        int[] a = {9,9};
        System.out.println(Arrays.toString(plusOne(a)));
    }

    public static int[] plusOne(int[] digits) {


        digits[digits.length-1]+=1;
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]+=1;
            }
        }

        if(digits[0]==10){
            int[] res = new int[digits.length+1];
            digits[0]=0;
            res[0]=1;
            for(int i=1;i<res.length;i++){
                res[i]= digits[i-1];
            }

            return res;
        }
        return digits;


    }
}
