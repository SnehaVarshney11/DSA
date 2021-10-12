class MinDominoRotationsForEqualRow {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int len = tops.length;
        int[] countSum = new int[7], countTops = new int[7], countBottoms = new int[7];
        
        for(int i = 0; i < len; i++){
            if(tops[i] == bottoms[i])
                countSum[tops[i]]++;
            else{
                countSum[tops[i]]++;
                countSum[bottoms[i]]++;
                countTops[tops[i]]++;
                countBottoms[bottoms[i]]++;
            }
        }
        for(int i = 1; i <= 6; i++){
            if(countSum[i] == len)
                return Math.min(countTops[i], countBottoms[i]);
        }
        return -1;
    }    
}
