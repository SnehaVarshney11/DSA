class LargNoAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int max = 0, second = 0, maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                second = max;
                max = nums[i];
                maxIndex = i;
            } else if (second < nums[i]) second = nums[i];
        }
        return max >= 2 * second ? maxIndex : -1;
    }
}
