class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int max=0;
      for(int x:piles){
        max=Math.max(max,x);
      } 
      int left=1;
      int right=max;
      int ans=max;

      while(left<=right){
        int k = left+(right-left)/2;

        long hours=0;
        for(int x:piles){
            hours+=(x+k-1)/k;
        }

        if(hours<=h){
            ans=k;
            right=k-1;
        }
        else{
            left=k+1;
        }
      }
      return ans;
    }
}