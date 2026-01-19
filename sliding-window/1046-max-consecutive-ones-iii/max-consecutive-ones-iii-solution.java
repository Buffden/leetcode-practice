class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxCount = 0;
        int onesCount = 0;

        for (int right = 0; right < nums.length; right++) {
            // condition such that the substring should be valid:
            // while loop is for the shrinking of window condition
            onesCount += nums[right];
            while (right - left + 1 - onesCount > k) {
                onesCount -= nums[left];
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;

    }
}
