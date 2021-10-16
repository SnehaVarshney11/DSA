class SprialMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
    
        int up = 0;
        int down = n-1;
        int left = 0;
        int right = m-1;
    
        List<Integer> list = new ArrayList<>();
    
        while(up <= down && left <= right){
            for(int i = left; i <= right; i++){
                list.add(matrix[up][i]);
        }
        up++;
        
        for(int i = up; i <= down; i++){
            list.add(matrix[i][right]);
        }
        right--;
        if(down < up){
            break;
        }
        for(int i = right; i >= left; i--){
            list.add(matrix[down][i]);
        }
        down--;
        if(right < left){
            break;
        }
        for(int i = down; i>= up; i--){
            list.add(matrix[i][left]);
        }
        left++;
    }
    
    return list;
    }
}
