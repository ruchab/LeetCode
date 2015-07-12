package arrays;

import java.util.Arrays;

/**
 * Created by Rucha on 6/20/15.
 * Rotate an array of n elements to the right by k steps.
 *For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class rotateArray {

    public static void main(String[] args){

       int[]arr= {1,2,3,4};
       int n = 3;
       rotateArray(arr,n);
        System.out.println(Arrays.toString(arr));

    }

    public static void rotateArray(int[] arr, int n){
        n %=arr.length; //if n i greater than arr.length then the resulting shift is n%arr.length

        reverse(arr,0,arr.length-1); //reverse whole array
        reverse(arr,0,n-1);         //reverse from 0 to n-1
        reverse(arr,n,arr.length-1); //reverse from n to end
    }

    public static void reverse(int[] arr,int left,int right){
        if(arr == null || arr.length==1) return;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    //332ms
//    public void rotate(int[] a,int k){
//        k %=a.length;
//        int[] aux = new int[a.length];
//        for(int i=0;i<a.length;i++){
//            aux[i] = a[i];
//        }
//
//        for(int i=0;i<a.length;i++){
//            if(i+k < a.length){
//                a[i+k] = aux[i];
//            }else{
//                a[Math.abs( (i+k) - a.length)] = aux[i];
//            }
//        }
//    }

}
