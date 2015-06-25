package BinarySearch;

/**
 * Created by Rucha on 6/24/15.
 */
public class binarySearch {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 5, 6, 6, 6};
        System.out.println(binarySearch(a, 0, 8, 6));
    }


    public static int binarySearch(int[] a, int first, int last, int n) {
        int index;
        if (first > last) return -1;

        else {
            int mid = (first + last) / 2;
            if (a[mid] == n)
                index = mid;
            else if (a[mid] <= n) {
                index = binarySearch(a, mid + 1, last, n);
            } else {
                index = binarySearch(a, first, mid - 1, n);
            }
        }
        return index;

    }

}