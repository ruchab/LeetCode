package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rucha on 7/6/15.
 * Given an array of strings, return all groups of strings that are anagrams.
 //means string have same set of characters. 'aba' 'baa';
 Note: All inputs will be in lower-case.
 */
public class Anagrams {

    public List<String> anagrams(String[] strs) {
        if(strs.length==0 || strs==null) return new ArrayList<String>();

        List<String> result = new ArrayList<String>();
        HashMap<String,List<String>> map = new HashMap<String, List<String>>();
        for(String word: strs){

            String key = toAnagram(word);
            if(map.containsKey(key)){
                List<String> temp = new ArrayList<String>();
                temp = map.get(key);
                if(temp.size()==1){
                    result.add(temp.get(0));
                }
                temp.add(word);
                map.put(key,temp);
                result.add(word);
            }else{
                List<String> temp = new ArrayList<String>();
                temp.add(word);
                map.put(key,temp);
            }
        }

        return result;

    }

    public String toAnagram(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);

    }


}
