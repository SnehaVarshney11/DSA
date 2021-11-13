class MaximalRectangle{
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
            return 0;
        int row = matrix.length, col = matrix[0].length;
        int maxArea = 0;
        int[] height = new int[col];
        int[] left = new int[col];
        int[] right = new int[col];
        Arrays.fill(right, col);
        
        for(int i = 0; i < row; i++){
            //Get height at row i
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == '1')
                    height[j]++;
                else
                    height[j] = 0;
            }
            //get left at row i
            int curLeft = 0;
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == '1')
                    left[j] = Math.max(left[j], curLeft);
                else{
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }
            // Get right at row i
            int curRight = col;
            for (int j = col-1; j >= 0; j--) {
                if (matrix[i][j] == '1') {
                    right[j] = Math.min(right[j], curRight);
                } else {
                    right[j] = col;
                    curRight = j;
                }
            }
            // Get max area
            for (int j = 0; j < col; j++) {
                int area = (right[j] - left[j]) * height[j];
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}