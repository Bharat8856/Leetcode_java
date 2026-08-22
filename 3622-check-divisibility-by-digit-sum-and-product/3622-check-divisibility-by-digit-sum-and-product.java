class Solution {
    public boolean checkDivisibility(int n) {
        int digi=0;
        int sum=0;
        int prod=1;
        int total=0;
        int temp=n;
        while(n>0){
            digi=n%10;
            prod*=digi;
            sum+=digi;
            n/=10;
        }
        total=sum+prod;
        return temp%total==0;

    }
}