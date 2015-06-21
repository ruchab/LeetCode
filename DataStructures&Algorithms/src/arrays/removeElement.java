package arrays;

/**
 * Created by Rucha on 6/20/15.
 * Given an array and a value, remove all instances of that value in place and return the new length.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class removeElement {

    public static void main(String[] args){
        int[] a = {1,1,1,1,2,2,2,3,3,4};
        System.out.println(removeElement(a,3));
    }

    public static int removeElement(int[] a,int elem){
        if(a.length==0) return 0;

        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=elem){
                a[count] = a[i];
                count++;
            }
        }

        return count;
    }
}
