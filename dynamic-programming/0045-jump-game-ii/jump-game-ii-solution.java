class Solution {
    public int jump(int[] nums) {
        int jumpCounts = 0;
        int lastJumpIndex = 0;
        int coverage = 0;
        int destination = nums.length - 1;

        for (int i = 0; i < destination; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastJumpIndex) {
                lastJumpIndex = coverage;
                jumpCounts++;

                if (lastJumpIndex == destination) {
                    return jumpCounts;
                }
            }
        }
        return jumpCounts;
    }
}
