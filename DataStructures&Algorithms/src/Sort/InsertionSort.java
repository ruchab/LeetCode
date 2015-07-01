package Sort;

/**
 * Created by Rucha on 6/24/15.
 */
public class InsertionSort {

    public static void insertionSort(int[] a){

        for(int i = 1;i<a.length-1;i++){
            int loc =i;
            while(loc > 0 && a[loc--] > a[i]){
                int temp = a[i];
                a[i] = a[loc];
                a[loc] = temp;
            }
        }
    }
}
