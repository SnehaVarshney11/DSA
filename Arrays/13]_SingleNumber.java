import java.util.*;
class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                a = nums[i];
                break;
            }
            else{
                a = nums[nums.length-1];
            }
        }
        return a;
    }    
}
