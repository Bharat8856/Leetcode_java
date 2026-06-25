class Solution {
    public int countKeyChanges(String s) {
      String s1=s.toLowerCase();
      int count=0;
      for(int i=1;i<s1.length();i++){
           if(s1.charAt(i-1)!=s1.charAt(i)){
            count++;
           }
      }
      return count;
        
    }
}