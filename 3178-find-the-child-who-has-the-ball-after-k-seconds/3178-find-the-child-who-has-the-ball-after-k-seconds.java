class Solution {
    public int numberOfChild(int n, int k) {
        int num=0;
        int temp=1;
        for(int i=0;i<k;i++){
            num+=temp;
            if(num==n-1){
                temp=-1;
            }
            if(num==0){
                temp=1;
            }
        }
        return num;
    }
}