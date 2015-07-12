package DynamicProgramming;

/**
 * Created by Rucha on 7/12/15.
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSum {


//    //1.recursive approach TLE
//    public int minPathSum(int[][] grid) {
//        int m = grid.length; //number of rows
//        int n = grid[0].length; //number of columns
//
//        return minPathSumHelper(grid,m-1,n-1);
//
//
//    }
//
//    public int minPathSumHelper(int[][] grid,int m ,int n){
//        if(m==0 || n==0){
//            return grid[m][n];
//        }
//
//        else{
//            return grid[m][n] + Math.min(minPathSumHelper(grid,m-1,n),minPathSumHelper(grid,m,n-1));
//        }
//    }


    //2.Dynamic Programming Runtime: 368 ms

    public int minPathSum(int[][] grid) {
        int m = grid.length; //number of rows
        int n = grid[0].length; //number of columns

        int [][] tc = new int[m][n];

        //initilaize the first celll
        tc[0][0] = grid[0][0];

        //Intiliaize first column of totalsum of tc
        for(int i=1;i<m;i++){
            tc[i][0] = grid[i][0] + tc[i-1][0];
        }

        //Intilaize first row of totalsum of tc
        for(int i=1;i<n;i++){
            tc[0][i] = grid[0][i] + tc[0][i-1];
        }

        //Construct rest of the tc
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                tc[i][j] = grid[i][j] + Math.min(tc[i-1][j],tc[i][j-1]);
            }
        }

        return tc[m-1][n-1];
    }

}
