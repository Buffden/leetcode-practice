class Solution {
    public int findMin(int[] nums) {
        // min in the whole rotated sorrted array

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        // both pointers left and right are pointing to the same index, and that index is the minimum
        return nums[left];
    }
}
