class Solution {
    public int[] searchRange(int[] nums, int target) {
      int[] ans = new int[2];
      ans[0]=firstfindindex(nums,target);
      ans[1]=secondfindindex(nums,target);
      return ans;
    }
    public int firstfindindex(int[]nums,int target){
        int first =-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right = mid - 1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return first;
    }
    public int secondfindindex(int[]nums,int target){
        int second =-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                second=mid;
                left = mid + 1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return second;
    }
}