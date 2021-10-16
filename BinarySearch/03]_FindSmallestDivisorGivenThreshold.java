class FindSmallestDivisorGivenThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = 1000000;
        
        while(left <= right){
            int mid = left+(right-left)/2;
            long sum = getDivSum(nums, mid);
            if(sum > threshold){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
    private long getDivSum(int[] nums, int divisor){
        long sum = 0;
        for(int num: nums){
            sum += (num-1)/divisor+1; //ceil of (num/divisor)
        }
        
        return sum;
    }    
}
