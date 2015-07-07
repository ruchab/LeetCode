package BitManipulation;

/**
 * Created by Rucha on 7/4/15.
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    //360 ms
    public int majorityElement(int[] num) {
        int major = num[0];
        int count =1;

        for(int i=1;i<num.length;i++){
            if(count==0){
                major = num[i];
                count++;
            }else if(num[i] == major){
                count++;
            }else{
                count --;
            }
        }

        return major;
    }

    //436 ms
//    public int majorityElement(int[] num) {
//
//        if(num.length==1)
//            return num[0];
//
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for(int i=0;i< num.length;i++){
//            if(map.containsKey(num[i])){
//                map.put(num[i],map.get(num[i]) + 1);
//            }
//            else{
//                map.put(num[i],1);
//            }
//
//        }
//
//        //int max = 0;
//        int major=0;
//        for(Integer k : map.keySet()){
//            int val = map.get(k);
//            if(val > num.length/2){
//                major = k;
//            }
//        }
//
//        return major;
//    }
}
