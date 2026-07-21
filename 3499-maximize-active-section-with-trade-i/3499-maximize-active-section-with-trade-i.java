class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        int prevZero = Integer.MIN_VALUE;
        int maxZero = 0;

        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            int count = 0;

            while (i < s.length() && s.charAt(i) == ch) {
                count++;
                i++;
            }

            if (ch == '0') {
                maxZero = Math.max(maxZero, prevZero + count);
                prevZero = count;
            }
        }

        return ones + maxZero;
    }
}