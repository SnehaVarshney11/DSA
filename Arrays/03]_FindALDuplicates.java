import java.util.*;
class Solution3 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            int indexToBeNegative = Math.abs(nums[i]) - 1;
        if(nums[indexToBeNegative] < 0)
            res.add(Math.abs(nums[i]));
        else
            nums[indexToBeNegative] = - nums[indexToBeNegative];        
        }
        return res;
    }
}