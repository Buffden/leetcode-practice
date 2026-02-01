class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myFreq = new HashMap<Integer, Integer>();
        HashSet<Integer> mySet = new HashSet<Integer>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (mySet.contains(nums[i]) == false) {
                mySet.add(nums[i]);
                myFreq.put(nums[i], i);
            }
            int difference = target - nums[i];
            if (mySet.contains(difference) && myFreq.get(difference) != i) {
                ans[0] = i;
                ans[1] = myFreq.get(difference);
                return ans;
            }
        }
        return ans;
    }
}
