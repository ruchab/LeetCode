package Math;

/**
 * Created by Rucha on 6/28/15.
 */
public class AddBinary {


    public static void main(String[] args){
        System.out.print(addBinary("0","0"));
    }
    public static String addBinary(String a, String b) {
        if(a.isEmpty()) return b;
        if(b.isEmpty()) return a;

        StringBuilder sb = new StringBuilder();
        char[] aCharArr = a.toCharArray();
        char[] bCharArr = b.toCharArray();
        int result=0;
        int carry=0;
        int i = aCharArr.length-1;  //start from lsb
        int j = bCharArr.length-1;
        int aByte=0;
        int bByte = 0;
        while(i>-1 || j>-1 || carry==1){
            aByte =  i > -1 ? Character.getNumericValue(aCharArr[i--]) : 0;
            bByte = j > -1 ? Character.getNumericValue(bCharArr[j--]) : 0;
            result = aByte ^ bByte ^ carry;
            carry = ((aByte + bByte + carry) >= 2 )? 1 : 0;
            sb.append(result);
        }

        return sb.reverse().toString();
    }
}
