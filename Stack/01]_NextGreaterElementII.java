class NextGreaterElementII{
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = nums.length-1; i>=0; i--){
            st.push(nums[i]);
        }
        int ar[] = new int[n];
        for(int i = nums.length-1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            ar[i] = st.empty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return ar;
    }
}