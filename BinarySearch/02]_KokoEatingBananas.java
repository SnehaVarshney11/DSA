import java.util.*;
class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Arrays.stream(piles).max().getAsInt();
        while(left <= right){
            int mid = left + (right - left)/2;
            if(canEatInTime(piles, mid, h))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
    private boolean canEatInTime(int[] piles, int k, int h){
        int hrs = 0;
        for(int p : piles){
            int div = p / k;
            hrs += div;
            if(p % k != 0) ++hrs;
        }
        return hrs <= h;
    }    
}
