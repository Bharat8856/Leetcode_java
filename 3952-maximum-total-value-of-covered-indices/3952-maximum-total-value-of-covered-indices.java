class Solution {

    public long maxTotal(int[] nums, String s) {

        long ans = 0;
        int n = nums.length;
        int i = 0;

        while (i < n) {

            // Skip positions having no token
            if (s.charAt(i) == '0') {
                i++;
                continue;
            }

            // Start of consecutive 1s
            int start = i;

            while (i + 1 < n && s.charAt(i + 1) == '1') {
                i++;
            }

            int end = i;

            // Position immediately before the group
            int left = start - 1;

            if (left < 0) {

                // No position before the group
                for (int j = start; j <= end; j++) {
                    ans += nums[j];
                }

            } else {

                long total = nums[left];
                int minValue = nums[left];

                // Consider [left ... end]
                for (int j = start; j <= end; j++) {
                    total += nums[j];
                    minValue = Math.min(minValue, nums[j]);
                }

                // Leave the smallest value uncovered
                ans += total - minValue;
            }

            i++;
        }

        return ans;
    }
}
