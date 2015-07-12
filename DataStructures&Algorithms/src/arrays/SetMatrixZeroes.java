package arrays;

/**
 * Created by Rucha on 7/12/15.
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 * Runtime: 480 ms
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {

        if(matrix==null) return;
        int m = matrix.length;
        int n = matrix[0].length;
        boolean fr=false,fc=false;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    if(i==0) fr=true;
                    if(j==0) fc= true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

//Note i=1 here since we already set 0th position as 0;
        for(int i=1;i<m;i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[0][j] ==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }

            }
        }

        if(fr){
            for(int i=0;i<n;i++){
                matrix[0][i] =0;
            }
        }

        if(fc){
            for(int j=0;j<m;j++){
                matrix[j][0] = 0;
            }
        }


    }
}
