public class SmMatrSolution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length){

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                col++;
            else if (matrix[row][col] > target)
                row--;
        }
        return false;
    }

    //
    public boolean searchMatrix1(int[][] matrix, int target) {

        int m = matrix.length - 1, n = 0;

         int lo=0;
         int ho=(n*m)-1;

         while(lo<=ho){

             int mid= (lo+(lo+ho)/2);
             if(matrix[mid/m][mid%m]==target){
                 return true;
             }
             else if(matrix[mid/m][mid%m]<target){
                 lo=mid+1;

             }
             else if(matrix[mid/m][mid%m]>target){
                 ho=mid-1;

             }

    return false;


         }

 return false;
    }
}


