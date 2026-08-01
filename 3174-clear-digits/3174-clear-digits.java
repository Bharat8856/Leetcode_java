class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            else{
                sb.setLength(sb.length()-1);
            }
        }
        return sb.toString();
    }
}