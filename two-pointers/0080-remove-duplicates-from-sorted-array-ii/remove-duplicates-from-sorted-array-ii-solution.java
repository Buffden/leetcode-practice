class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int follower = 1;
        int seeker = 2;

        while (seeker < nums.length) {
            if (nums[seeker] != nums[follower - 1]) {
                nums[++follower] = nums[seeker];
            }
            seeker++;
        }

        return follower + 1;  
    }
}
