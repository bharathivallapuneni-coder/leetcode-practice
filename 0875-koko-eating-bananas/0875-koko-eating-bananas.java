class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pls : piles) {
            high=Math.max(high,pls);
        }
        while(low<high){
            int mid=(low+high)/2;
            long hours=0;
            for(int pls:piles)
                hours += (pls+mid-1)/mid;
            if (hours<=h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}