class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> arrs = new ArrayList<List<Integer>>();

        int left = 0;
        int right = nums.length;
        int target = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            target -= nums[i];
            System.out.println(target);
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                if (target > nums[left] + nums[right]) {
                    left++;
                } else if (target < nums[left] + nums[right]) {
                    right--;
                } else {
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    arrs.add(arr);

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }

            }
            target = 0;
            
        }
        return arrs;

    }
}
