package arrays;

/**
 * Created by Rucha on 6/20/15.
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
public class mergeSortedArray {


    public void merge(int A[], int m, int B[], int n) {

        int k = m+n-1;
        int i = m-1;
        int j = n-1;

       while(i>-1 && j>-1){
           if(A[i] > B[j]){
               A[k--] = A[i--];
           }
           else{
               A[k--] = B[j--];
           }
       }
        //i exhausted
        while(j > -1){
            A[k--] = B[j--];
        }

        //j exhausted
        while(i>-1){
            A[k--] = A[i--];
        }

     }
}
