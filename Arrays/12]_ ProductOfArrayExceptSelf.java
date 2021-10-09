class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        res[0] = 1;
        
        for(int i=1; i<size; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        int temp = 1;
        
        for(int i=nums.length-2; i>=0; i--){
            res[i] *= nums[i+1] * temp;
            temp *= nums[i+1];
        }
        return res; 
    }
}
