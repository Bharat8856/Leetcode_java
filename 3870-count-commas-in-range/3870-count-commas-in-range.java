class Solution {
    public int countCommas(int n) {
        int sum=0;
        int temp=1000;
        while(temp>=1000&&temp<=n){
            sum++;
            temp++;
        }
        return sum;
    }
}