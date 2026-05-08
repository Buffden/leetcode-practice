class Solution {
    public int searchInsert(int[] nums, int target) {
        // 2 phases
        // see if its index can be found
        // if not then choose the right place for it

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}
