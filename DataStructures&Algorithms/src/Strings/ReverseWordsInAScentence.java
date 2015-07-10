package Strings;

/**
 * Created by Rucha on 7/8/15.
 */
public class ReverseWordsInAScentence {
    public static void main(String[] args) {
        System.out.println(reverseWords("I am Rucha"));
    }

    public static String reverseWords(String s){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i= arr.length-1;i>=0;i--){
            sb.append(arr[i]).append(" ");
        }

        return sb.toString();
    }
}
