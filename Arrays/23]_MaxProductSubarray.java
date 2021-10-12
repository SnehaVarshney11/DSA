class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        
        //Base Case
        if(length == 0) return 0;
        
        //Set Variables
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        
        for(int i = 1; i < length; i++){
            int temp_max = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i]));
            min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i]));
            
            max = temp_max;
            ans = Math.max(ans, max);
        }
        return ans;
    }    
}
