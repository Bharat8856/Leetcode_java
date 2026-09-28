class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[t.length];

        for(int i=0;i<t.length;i++){
            while(!st.isEmpty()&&t[st.peek()]<t[i]){
                int preindx=st.pop();
                ans[preindx]=i-preindx;
            }
            st.push(i);
        }
        return ans;
    }
}