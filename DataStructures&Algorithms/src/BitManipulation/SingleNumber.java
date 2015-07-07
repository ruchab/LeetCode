package BitManipulation;

/**
 * Created by Rucha on 7/4/15.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 380ms
 */
public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int result =0;

        for(int i : nums){
            System.out.println("Result::" + result);
            result = result ^ i; //if the number is same result wil be 0 else num
        }
        return result;
    }
}
