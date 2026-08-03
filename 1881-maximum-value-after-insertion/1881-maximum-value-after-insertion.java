class Solution {
    public String maxValue(String n, int x) {
     char ch =(char)(x+'0');
     if(n.charAt(0)=='-'){
        for(int i=1;i<n.length();i++){
            if(n.charAt(i)>ch){
                return n.substring(0,i)+ch+n.substring(i);
            }
        }
        return n+ch;
     }
     for(int i=0;i<n.length();i++){
        if(n.charAt(i)<ch){
             return n.substring(0,i)+ch+n.substring(i);
        }
     }
     return n+ch;
    }
}