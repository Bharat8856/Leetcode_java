class Solution {
    public int passThePillow(int n, int time) {
        int num=1;
        int temp=1;
        for(int i=0;i<time;i++){
            num+=temp;
            if(num==n){
                temp=-1;
            }
            if(num==1){
                temp=1;
            }
        }
        return num;
    }
}