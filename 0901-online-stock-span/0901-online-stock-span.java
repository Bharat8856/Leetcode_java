class StockSpanner {

    Stack<Integer> st = new Stack<>();
    List<Integer> list=new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        list.add(price);
        int i=list.size()-1;
        while(!st.isEmpty()&&list.get(st.peek())<=price){
            st.pop();
        }
        int ans;

        if(st.isEmpty()){
            ans=i+1;
        }
        else{
            ans=i-st.peek();
        }
        st.push(i);
        return ans;
    }
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */