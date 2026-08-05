class Solution {
    public long removeZeros(long n) {
        long res = 0;

        while (n > 0) {
            long digit = n % 10;

            if (digit != 0) {
                res = res * 10 + digit;
            }

            n /= 10;
        }

        long ans = 0;

        while (res > 0) {
            ans = ans * 10 + res % 10;
            res /= 10;
        }

        return ans;
    }
}