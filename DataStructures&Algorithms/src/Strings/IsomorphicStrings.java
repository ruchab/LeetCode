package Strings;

import java.util.HashMap;

/**
 * Created by Rucha on 7/9/15.
 * Given two strings s and t, determine if they are isomorphic.
 Two strings are isomorphic if the characters in s can be replaced to get t.
 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 For example,
 Given "egg", "add", return true.
 Given "foo", "bar", return false.
 Given "paper", "title", return true.
 Note:
 You may assume both s and t have the same length.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {


        HashMap<Character,Character> map = new HashMap<Character, Character>();
        for(int i =0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(s.charAt(i))){

                if(map.get(s.charAt(i)).equals(t.charAt(i)))
                    continue;
                else return false;
            }else{
                if(!map.containsValue(b))
                map.put(s.charAt(i),t.charAt(i));
                else
                    return false;
            }
        }
        return true;
    }
}
