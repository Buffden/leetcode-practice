class Solution {
    public int removeDuplicates(int[] nums) {
        // int jockey = 1;
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] != nums[i - 1]) {
        //         nums[jockey] = nums[i];
        //         jockey++;
        //     } else {
        //         // hold on to jockey variable untill the new value appears
        //     }
        // }
        int follower = 0;
        int seeker = 1;

        while (seeker < nums.length) {
            if (nums[follower] != nums[seeker]) {
                nums[++follower] = nums[seeker];
            }
            seeker++;
        }
        return follower + 1;
    }
}
