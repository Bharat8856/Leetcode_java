import java.util.*;

class Solution {
    public int longestWPI(int[] hours) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLength = 0;
        
        for (int i = 0; i < hours.length; i++) {
            
            if (hours[i] > 8) {
                sum++;
            } else {
                sum--;
            }
            
            // If total sum is positive
            if (sum > 0) {
                maxLength = i + 1;
            }
            
            // Store first occurrence
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            
            // Check if sum - 1 exists
            if (map.containsKey(sum - 1)) {
                int length = i - map.get(sum - 1);
                maxLength = Math.max(maxLength, length);
            }
        }
        
        return maxLength;
    }
}