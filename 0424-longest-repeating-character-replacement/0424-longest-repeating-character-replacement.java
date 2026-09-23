class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int ans=0;
        int[] freq= new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            max=Math.max(max, freq[s.charAt(i)-'A']);
            int length=i-left+1;
            if(length-max>k){
            freq[s.charAt(left)-'A']--;
            left++;
        } 
        ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}