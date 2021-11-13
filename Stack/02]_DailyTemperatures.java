class DailyTemperatures{
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i--){
            int temp = temperatures[i];
            if(stack.isEmpty()){
                stack.push(i);
                ans[i] = 0;
            }else{
                if(temp < temperatures[stack.peek()]){
                    ans[i] = stack.peek() - i;
                    stack.push(i);
                }else{
                    while(stack.isEmpty() == false && temperatures[stack.peek()] <= temp){
                        stack.pop();
                    }
                    if(stack.isEmpty()){
                        ans[i] = 0;
                    }else{
                        ans[i] = stack.peek() - i;
                    }
                    stack.push(i);
                }
            }
        }
    
        return ans;
    }
}