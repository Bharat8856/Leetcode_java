class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int[] ans= new int[res.size()];
        int i=0;
        for(int x:res){
            ans[i]=x;
            i++;
        }
        return ans;
    }
}