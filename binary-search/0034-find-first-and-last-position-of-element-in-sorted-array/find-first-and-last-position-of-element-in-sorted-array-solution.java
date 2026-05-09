class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int first = 0;
        int last = right;
        int[] ans = {-1, -1};

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                ans[0] = mid;
                right = mid - 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                ans[1] = mid;
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}
