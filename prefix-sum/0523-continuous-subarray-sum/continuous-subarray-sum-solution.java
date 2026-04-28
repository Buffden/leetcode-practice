class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        // Trick: 
        // If two prefix sums have the same remainder when divided by k,
        // then the subarray between them has sum divisible by k.

        // prefix2 % k == prefix1 % k
        // => prefix2 - prefix1 is divisible by k

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            int rem = prefix % k;

            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);

                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }
}
