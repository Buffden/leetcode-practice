class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;

            int slow = i;
            int fast = i;
            boolean forward = nums[i] > 0;

            while (true) {
                slow = findNext(nums, slow, forward);
                if (slow == -1) break;

                fast = findNext(nums, fast, forward);
                if (fast == -1) break;

                fast = findNext(nums, fast, forward);
                if (fast == -1) break;

                if (slow == fast) return true;
            }

            // Mark visited nodes as 0 to prevent reprocessing
            int idx = i;
            while (nums[idx] != 0 && (nums[idx] > 0) == forward) {
                int next = ((idx + nums[idx]) % n + n) % n;
                nums[idx] = 0;
                idx = next;
            }
        }
        return false;
    }

    private int findNext(int[] nums, int curr, boolean forward) {
        boolean dir = nums[curr] > 0;
        if (dir != forward) return -1;

        int n = nums.length;
        int next = ((curr + nums[curr]) % n + n) % n;

        if (next == curr) return -1; // self-loop

        return next;
    }
}

