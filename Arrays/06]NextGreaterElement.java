class NextGreaterElement {
    public int nextGreaterElement(int n) {
        long m = n;
        int[] count = new int[10];
        int currRem = -1;
        int prevRem = -1;
        
        while(m > 0){
            currRem = (int)m % 10;
            m = m/10;
            count[currRem]++;
            if(prevRem > currRem){
                int num = currRem + 1;
                while(count[num] == 0){
                    num++;
                }
                count[num]--;
                m = m * 10 + num;
                
                for(int i = 0; i < 10; i++){
                    while(count[i]-->0)
                        m = m * 10 + i;
                }
                return m > Integer.MAX_VALUE ? -1 : (int)m;
            }
            prevRem = currRem;
        }
        return -1;
    }
}
