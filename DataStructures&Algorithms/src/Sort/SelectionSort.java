package Sort;

import java.util.Arrays;

/**
 * Created by Rucha on 6/24/15.
 * Select the smallest item and put it in the correct place
 */
public class SelectionSort {

    public static void main(String[] args){
        int[] a = {8,7,6,5,4,3,2,1};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selectionSort(int[] a){

        for(int i=0;i<a.length-1;i++){
            int min = findMin(a,i,a.length-1); //position of the minimum element
            //now swap the two numbers
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;


        }
    }

    public static int findMin(int[] a,int first,int last){
        int min = a[first];
        int minIndex = first;
        for(int i = first+1;i<=last;i++){
            if(a[i] < min){
                minIndex = i;
                min = a[minIndex];
            }
        }
        return minIndex;
    }
}
