class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> pair = new HashMap<Integer, Integer>();
        HashSet<Integer> seen = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            int neededNumber = target - nums[i];
            if (seen.contains(neededNumber)) {
                ans[0] = pair.get(neededNumber);
                ans[1] = i;
                return ans;
            } else {
                pair.put(nums[i], i);
                seen.add(nums[i]);
            }
        }
        return ans;
    }
}
