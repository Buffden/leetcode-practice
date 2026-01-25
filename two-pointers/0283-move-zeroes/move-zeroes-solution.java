class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 1;
        int lastPos = 0;

        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[lastPos] = nums[fast];
                lastPos++;
            }
        }

        for (;lastPos < nums.length; lastPos++) {
            nums[lastPos] = 0;
        }

    }
}
