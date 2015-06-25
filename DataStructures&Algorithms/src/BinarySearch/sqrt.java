package BinarySearch;

/**
 * Created by Rucha on 6/24/15.
 * Newtons Method
 */
public class sqrt {


    public static void main(String[] args){
        System.out.println(mySqrt(25));
    }

    public static int mySqrt(int x){
        if ( x == 0) return 0;
        if ( x == 1) return 1;

        int low = 1;
        int high = x;

        while(low<=high){
            int mid = (low + high)/2;

            int temp = x/mid;

            if(temp == mid) return mid;
            else if (temp < mid) high = mid -1;
            else low = mid+1;
        }

        return low-1;
    }

}
