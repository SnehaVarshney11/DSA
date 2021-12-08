package DP;

import java.util.Arrays;

class UncrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) 
    {
        int arr[][] = new int[nums1.length+1][nums2.length+1];
        for(int[] x:arr)
        Arrays.fill(x,  -1);
        return lcs(nums1,nums2,nums1.length,nums2.length,arr);
    }
    public int lcs(int[] s1,int[] s2,int m,int n,int [][] arr)
    {
        if(arr[m][n]!=-1)
            return arr[m][n];
        if(m==0||n==0)
        return 0;
        else
        {
            if(s1[m-1]==s2[n-1])
            arr[m][n] = 1+lcs(s1,s2,m-1,n-1,arr);
            else
            arr[m][n] = Math.max(lcs(s1,s2,m-1,n,arr),lcs(s1,s2,m,n-1,arr));
        }
        return arr[m][n];
    }    
}
