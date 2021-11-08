public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid;
        int res = n;
        
        while(start<=end){
            mid = start + (end-start)/2;
            if(isBadVersion(mid))
            {
                res = mid;
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return res;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}
