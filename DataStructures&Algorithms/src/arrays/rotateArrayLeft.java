package arrays;

import java.util.Arrays;

/**
 * Created by Rucha on 6/20/15.
 */
public class rotateArrayLeft {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        int k=2;
        rotateLeft(arr,k);

        System.out.print(Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    public static void reverse(int[] arr,int left,int right){
        if(arr == null || arr.length==1) return ;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
