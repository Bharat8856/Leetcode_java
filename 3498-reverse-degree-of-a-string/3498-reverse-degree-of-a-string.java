class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int res=0;
        for(int i=0;i<s.length();i++){
             res=(int)s.charAt(i)-'a'+1;
             int temp=27-res;
             sum+=((i+1)*temp);
        }
        return sum;
    }
}