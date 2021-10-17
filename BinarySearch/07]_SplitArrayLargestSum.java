class SplitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int left = nums[0], right = nums[0];
        
        for(int i = 1; i < n; i++){
            left = Math.max(left, nums[i]);
            right += nums[i];
        }
        
        while(left < right){
            int mid = left + (right - left)/2;
            if(canSplit(nums, mid, m))
                right = mid;
            else
                left = mid + 1;
        }
        return left;   
    }
    // can we split nums into m subarrays s.t. each subarray has sum <= amount
    public boolean canSplit(int[] nums, int amount, int m){
        int count = 1;
        int sum = 0;
        
        for(int i : nums){
            if(sum + i <= amount){
                sum += i;
                continue;
            }
            if(++count > m)
                return false;
            sum = i;
        }
        return true;
    }
}
