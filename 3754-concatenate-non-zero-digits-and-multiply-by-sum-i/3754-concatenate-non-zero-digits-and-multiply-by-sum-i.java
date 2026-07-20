class Solution {
    public long sumAndMultiply(int n) {
        int result=0;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
              result=result*10+rem;
            }
            n/=10;
        }
        long res=0;
        long sum=0;
        while(result>0){
            int re=result%10;
            sum+=re;
            res=res*10+re;
            result/=10;
        }

        return (long) res*sum;
    }
}