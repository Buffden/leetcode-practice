class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer, Integer> freq = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     if (freq.get(nums[i]) > 1) return true;
        // }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}
