class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int left = 0;
        int count = 0;
        int right = 0;
        int product = 1;

        for (right = 0; right < nums.length; right++) {
            product *= nums[right];
            // while is for invalid conditions
            while (product >= k) {
                if (left == nums.length) break;
                product /= nums[left];
                left++;
            }
            // all subarrays for each right is a valid count for our condition
            count += (right - left + 1);
        }
        return count;
    }
}
