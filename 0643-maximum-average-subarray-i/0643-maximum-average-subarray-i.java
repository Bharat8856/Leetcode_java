class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int windowsum=0;
        double max=0;
        double avg=0;

        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        max = (double) windowsum / k;
        for(int i=k;i<n;i++){
            windowsum+=nums[i]-nums[i-k];
            avg = (double) windowsum / k;
            max=Math.max(max,avg);
        }

        return max;
        
    }
}