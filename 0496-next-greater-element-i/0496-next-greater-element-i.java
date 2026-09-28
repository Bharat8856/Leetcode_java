class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int x:nums2){
            while(!st.isEmpty()&&st.peek()<x){
                int value=st.pop();
                map.put(value,x);
            }
            st.push(x);
        }

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                ans[i]=map.get(nums1[i]);
            }
            else{
                ans[i]=-1;
            }
        }
        return ans;
    }
}