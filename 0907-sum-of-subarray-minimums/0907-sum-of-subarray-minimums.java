import java.util.*;

class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        // Find previous smaller element
        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                left[i] = -1;
            }
            else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Find next smaller or equal element
        for(int i = n - 1; i >= 0; i--) {

            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) {
                right[i] = n;
            }
            else {
                right[i] = st.peek();
            }

            st.push(i);
        }

        long ans = 0;
        long MOD = 1000000007L;

        // Calculate contribution of every element
        for(int i = 0; i < n; i++) {

            long leftCount = i - left[i];
            long rightCount = right[i] - i;

            long contribution =
                (long) arr[i] * leftCount * rightCount;

            ans = (ans + contribution) % MOD;
        }

        return (int) ans;
    }
}