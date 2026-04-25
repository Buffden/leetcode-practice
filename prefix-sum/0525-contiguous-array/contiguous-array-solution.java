class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefix = 0;
        int count = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            // Hint: storing the first index in map, so that we can calculate the length by substracting it with the index to get the maxLength
            count += nums[i] == 0 ? -1 : 1;

            // If prefix repeats, that means subarray sum is zero.
            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            }
            else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}
