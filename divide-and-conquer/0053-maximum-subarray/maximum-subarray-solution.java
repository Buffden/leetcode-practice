class Solution {
    public int maxSubArray(int[] nums) {
        // as nums has negative numbers, we cannot use sliding window
        // hence using prefix sum
        // we have to return the sum as well, so we have to use the hashMap too so that we can calucate the difference of the prefix to get the sum of the subarray

        // for any index j, there exists the prefix prefix[i] such that prefix[j] - prefix[i] is the max 
        // sum is largest when the difference is the largest that means we need to maintain something min and something max ??

        // max subarray sum = current prefix - smallest prefix seen before
        int prefix = 0;
        int minPrefix = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            prefix += num;
            maxSum = Math.max(maxSum, prefix - minPrefix);
            minPrefix = Math.min(minPrefix, prefix);
        }

        return maxSum;
    }
}

