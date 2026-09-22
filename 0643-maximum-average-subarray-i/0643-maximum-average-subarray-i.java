class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int windowsum=0;
        double max=Double.NEGATIVE_INFINITY;
         
        for(int i=0;i<k;i++){
            windowsum+=nums[i];
        }
        double avg=(double)windowsum/k;
        max=Math.max(max,avg);

        for(int i=k;i<n;i++){
            windowsum+=nums[i]-nums[i-k];
            avg=(double)windowsum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}