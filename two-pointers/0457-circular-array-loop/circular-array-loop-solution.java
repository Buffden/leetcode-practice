class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        if (n == 1) return false;

        for (int i = 0; i < n; i++) {
            int slow = i;
            int fast = i;

            boolean direction = nums[i] > 0;
            while (true) {
                slow = next(nums, slow, direction);
                if (slow == -1) break;

                fast = next(nums, fast, direction);
                if (fast == -1) break;

                fast = next(nums, fast, direction);
                if (fast == -1) break;

                if (slow == fast) return true;
            }

        }
        return false;
        
    }
    public static int next(int[] nums, int curr, boolean direction) {
        if ((nums[curr] > 0) != direction) return -1;

        int n = nums.length;
        int next = ((curr + nums[curr]) % n + n) % n;

        if (next == curr) return -1;
        return next;
    }

}

