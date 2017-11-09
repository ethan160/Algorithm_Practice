public boolean searchMatrix(int[][] int target){
   if(matrix == null || matrix.length == 0) {
       return false;
   }
   if(matrix[0] == null || matrix[0].length == 0) {
      return false;
   }

   int row = matrix.length -1, column = matrix[0].length - 1;
   //from the left bottom corner to the right top corner

   for(int i=row, j=0; i>=0 && j<= column;){
      if(matrix[i][j] == target){
         return true;
      }
      if(matrix[i][j] <= target) {
         j++;
      }else{
         i--;
      }
   }
   return false;
}