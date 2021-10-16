class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Matrix empty, can not find element
   if (matrix.length == 0 || matrix[0].length == 0) {
       return false;
   }

   int m = matrix.length;
   int n = matrix[0].length;

   // Search row
   int targetRow = -1;
   for (int i = 0; i < m; i++) {
       if (target >= matrix[i][0] && target <= matrix[i][n - 1]) {
         targetRow = i;
         break;
       }
   }

  // No row found
  if (targetRow == -1) {
      return false;
  }

  for (int j = 0; j < n; j++) {
      // Target found
      if (matrix[targetRow][j] == target) {
          return true;
      }
      }

  // Target not inside row
  return false;
   }
}
