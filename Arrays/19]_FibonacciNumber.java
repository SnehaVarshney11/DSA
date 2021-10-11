class FibonacciNumber {
    public int fib(int n) {
        if(n <= 1)
            return n;
        
        int[] map = new int[n+1];
        
        //base condition
        map[0] = 0;
        map[1] = 1;
        
        for(int i = 2; i <= n; i++){
            map[i] = map[i-1] + map[i-2];
        }
        return map[n];
    }    
}
