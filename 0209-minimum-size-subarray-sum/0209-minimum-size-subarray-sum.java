class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                int length=i-left+1;
                minlength=Math.min(minlength,length);
                sum-=nums[left];
                left++;
            }
        }
        return minlength== Integer.MAX_VALUE ? 0 : minlength;
    }
}