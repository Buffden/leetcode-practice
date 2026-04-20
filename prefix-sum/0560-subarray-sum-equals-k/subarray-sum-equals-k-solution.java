class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int prefix = 0;
        int count = 0;

        for (int x : nums) {
            prefix += x;
            // it checks if a valid subarray exists
            if (map.containsKey(prefix - k)) { // required difference present in map -> increase count
                count += map.get(prefix - k);
            }
            // then update the map
            map.put(prefix, map.getOrDefault(prefix, 0) + 1); // core bookkeeping step of the algorithm.
        }
        return count;
    }
}
