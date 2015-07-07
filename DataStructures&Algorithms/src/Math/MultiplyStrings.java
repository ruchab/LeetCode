package Math;

/**
 * Runtime: 312 ms
 * Created by Rucha on 7/5/15.
 * Given two numbers represented as strings, return multiplication of the numbers as a string.

* Note: The numbers can be arbitrarily large and are non-negative.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {

        int n1 = num1.length();
        int n2 = num2.length();
        int n3 = n1+n2;

        if(num1.equals("0") || num2.equals("0"))
            return "0";
        int[] number = new int[n1+n2];

        for(int i= n1-1;i>=0;i--){
            for(int j = n2-1;j>=0;j--){
                int d1 = num1.charAt(i)-'0';
                int d2 = num2.charAt(j) - '0';
                number[i+j+1] += d1*d2;
            }
        }

        int carry =0;
        for(int k = number.length-1;k>=0;k--){
            int sum = carry + number[k];
            int digit = sum % 10;
            number[k] = digit;
            carry = sum /10;
        }

        StringBuilder sb = new StringBuilder();
        for(int digit : number){

            sb.append(digit);
        }

        if(sb.charAt(0)=='0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
