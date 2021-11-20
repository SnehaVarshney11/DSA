package Strings;

class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for(int c=0; c<strs[0].length(); c++)
        {
            for(int r=strs.length-2; r>=0; r--)
            {
                if(strs[r].charAt(c) > strs[r+1].charAt(c))
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }    
}
