class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack<Integer> st = new Stack<>();
       int max=0;
       for(int i=0;i<heights.length;i++){
           while(!st.isEmpty()&&heights[st.peek()]>heights[i]){
                 int height=heights[st.pop()];
                 int width;
                 if(st.isEmpty()){
                    width = i;
                 }
                 else{
                    width = i - st.peek() - 1;
                 }
                 int area = height*width;
                 max=Math.max(max,area);
           }
           st.push(i);
       }
       while(!st.isEmpty()){
        int height = heights[st.pop()];
        int width;
        if(st.isEmpty()){
            width=heights.length;
        }
        else{
             width = heights.length - st.peek() - 1;
        }
        int area = height*width;
        max=Math.max(max,area);
       }
       return max;
    }
}