package arrays;

/**
 * Created by Rucha on 6/21/15.
 * Runtime: 436 ms
 * O(log(mn))
 */
public class search2DMatrix {

    public static void main(String[] args){

        int matrix[][] = { {1,2,},{3,4},{5,6}};
        System.out.println("Rows::" + matrix.length);
        System.out.println("Columns::" + matrix[0].length);
        System.out.println(searchMatrix(matrix,4));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ;//number of rows
        int n = matrix[0].length; //number of columns
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return false;
        int start = 0;
        int end = m*n-1; //total number of elements in m*n matrix
        while(start <= end){
            int mid = (start + end)/2;
            int midX = mid/n;
            int midY = mid%n;

            if(matrix[midX][midY]==target) return true;
            else if (matrix[midX][midY] > target) end = mid-1;
            else start = mid+1;
        }
        return false;

    }
}
