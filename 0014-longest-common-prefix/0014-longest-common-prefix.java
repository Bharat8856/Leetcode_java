class Solution {
    public String longestCommonPrefix(String[] arr) {
        int minlength = arr[0].length();
        for(String str:arr){
            minlength=Math.min(minlength,str.length());
        }

        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<minlength;i++){
            char ch = arr[0].charAt(i);
            for(String str:arr){
                if(str.charAt(i)!=ch){
                    return res.toString();
                }
            }
            res.append(ch);
        }
        return res.toString();
    }
}