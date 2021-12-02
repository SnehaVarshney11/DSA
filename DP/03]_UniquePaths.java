package DP;

class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] ar = new int[m][n];
        
        for(int i = 0; i < m; i++){
            ar[i][0] = 1;
        }
        
        for(int j = 0; j < n; j++){
            ar[0][j] = 1;
        }
        
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                ar[i][j] = ar[i-1][j] + ar[i][j-1];
            }
        }
        return ar[m-1][n-1];
    }    
}
