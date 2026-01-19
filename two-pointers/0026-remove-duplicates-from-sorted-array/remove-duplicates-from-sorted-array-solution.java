class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;

        int slower = 0;
        int faster = 1;
        int right = nums.length - 1;

        while (faster < nums.length) {
            if (nums[slower] != nums[faster]) {
                nums[slower + 1] = nums[faster];
                slower++;
            } else {
                faster++;
            }
        }
        return slower + 1;
    }
        
}
