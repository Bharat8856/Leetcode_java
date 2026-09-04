class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        // minRight[i] = minimum element from i to n-1
        int[] minRight = new int[n];

        minRight[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }

        // Find the first stable index
        int maxLeft = nums[0];

        for (int i = 0; i < n; i++) {

            maxLeft = Math.max(maxLeft, nums[i]);

            int score = maxLeft - minRight[i];

            if (score <= k) {
                return i;
            }
        }

        return -1;
    }
}