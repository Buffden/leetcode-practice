class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int maxLength = 0;
        int onesCount = 0;

        for (int right = 0; right < nums.length; right++) {
            onesCount += nums[right];
            while (right - left + 1 - onesCount > 1) {
                onesCount -= nums[left];
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength - 1;

    }
}
