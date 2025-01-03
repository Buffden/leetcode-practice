class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] prefSum = new long[n];
        int count = 0;
        prefSum[0] = nums[0];
        System.out.println(prefSum[0]);
        for (int i = 1; i < n; i++) {
            prefSum[i] = prefSum[i - 1] + nums[i];
            System.out.println(prefSum[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            long rightSum = prefSum[n - 1] - prefSum[i];
            System.out.println("rightSum " + rightSum);
            if (prefSum[i] >= rightSum)
                count++;
        }
        return count;
    }
}
