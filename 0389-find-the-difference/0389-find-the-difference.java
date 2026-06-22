class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(char ch:t.toCharArray()){
            sum=sum+ch;
        }
        for(char ch:s.toCharArray()){
            sum=sum-ch;
        }

        return (char) sum;
        
    }
}