package Recursion;

/**
 * Created by Rucha on 7/8/15.
 */
public class StringReversal {

    public static void main(String[] args) {
       reverseStringIterative("Rucha");

        System.out.println(reverseStringSB("Rucha"));

        reverseStringRec("Rucha");
    }

    //In Place
    public static void reverseStringIterative(String s){

      int len = s.length();
        for (int i=(len-1);i>=0;i--){
            s +=s.charAt(i);
        }

        s = s.substring(len);

        System.out.println(s);
    }

    //Using StringBuilder
    public static String reverseStringSB(String s){

        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        for(int i = len-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    //Recursive

    public static void reverseStringRec(String s){
        if(s.length()>0){
            System.out.print(s.charAt(s.length()-1));
            reverseStringRec(s.substring(0,s.length()-1));
        }
    }
}
