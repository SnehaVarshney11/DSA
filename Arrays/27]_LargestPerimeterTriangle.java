package Arrays;

import java.util.Arrays;

class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-3; i >= 0; i--){
            if(isPossible(nums[i], nums[i+1], nums[i+2])){
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;
    }
    boolean isPossible(int a, int b, int c){
        double s = (a+b+c)/2.0;
        return s*(s-a)*(s-b)*(s-c) > 0;
    }    
}
