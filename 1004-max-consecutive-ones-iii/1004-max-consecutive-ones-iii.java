class Solution {
    public int longestOnes(int[] nums, int k) {
     int zero=0;
     int left=0;
     int maxlength=0;

     for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zero++;
        }

        while(zero>k){
            if(nums[left]==0){
                zero--;
            }
            left++;
        }

        int length=i-left+1;
        maxlength = Math.max(maxlength,length);

     }   
     return maxlength;
    }
}