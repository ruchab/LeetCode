package Strings;

/**
 * Created by Rucha on 7/8/15.
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if( (s.charAt(i)>='a'&&s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                sb.append(s.charAt(i));
            }
        }

        StringBuilder reverse = sb.reverse();


        return reverse.toString().equals(reverse.reverse().toString());
    }
}
