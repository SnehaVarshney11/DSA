class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int size = nums.length;
        int count=0;
        for(int i=0; i<size; i++)
        {
            for(int j=i; j<size; j++)
            {
                int sum=0;
                for(int s=i; s<=j; s++)
                {
                    sum = sum + nums[s];
                }
                if(sum==k)
            count++;
            }
        }
        return count;
    }    
}
