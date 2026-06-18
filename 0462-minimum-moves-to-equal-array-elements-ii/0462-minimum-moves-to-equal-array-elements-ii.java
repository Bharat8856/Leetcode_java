class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int temp=0;

        for(int num:nums){
            temp+=Math.abs(num-median);
        }
        
        return temp;
    }
}