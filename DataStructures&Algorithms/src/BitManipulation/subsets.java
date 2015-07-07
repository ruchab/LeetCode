package BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rucha on 7/4/15.
 * VVIMP
 * 280ms
 */
public class subsets{
    public static void main(String[] args) {
        int[] S = {1,2,3};
        System.out.println(subsets(S));
    }

    public static List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<List<Integer>>(); //result
        res.add(new ArrayList<Integer>()); //add an empty element to the result
        Arrays.sort(S); //sort the array since we want subsets in ascending order
        for(int i : S) {
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<Integer>(sub); //for each list in result add the element i
                a.add(i);
                tmp.add(a); //add this to tmp
            }
            res.addAll(tmp); //add tmp to result
            System.out.println(res);
        }
        return res;
    }
}
