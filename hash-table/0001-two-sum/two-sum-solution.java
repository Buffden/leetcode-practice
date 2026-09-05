class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myFreq = new HashMap<Integer, Integer>(); // number -> index
        HashSet<Integer> mySet = new HashSet<Integer>(); // for not choosing the same number that we added in map twice
        int[] ansArray = new int[2];

        for (int index = 0; index < nums.length; index++) {
            if (mySet.contains(nums[index]) == false) {
                mySet.add(nums[index]);
                myFreq.put(nums[index], index);
            }
            int difference = target - nums[index]; // we will find this difference in the map that holds its index too
            if (mySet.contains(difference) && myFreq.get(difference) != index) {
                ansArray[0] = index;
                ansArray[1] = myFreq.get(difference);
                return ansArray;
            }
        }
        return ansArray;
    }
}

