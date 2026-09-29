class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int totalnum = row * col - 1;

        int s = 0;
        int e = totalnum;

        while(s <= e){

        int mid = s + (e-s)/2;
        int rowIndex = mid/col;
        int colIndex = mid%col; 

        if(matrix[rowIndex][colIndex] == target){
            return true;

        }else if(matrix[rowIndex][colIndex] > target){
            e = mid - 1;
        }else{
            s = mid + 1;
        }
            
        }
        return false;
    }
}
