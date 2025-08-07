class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int startIndex = nums.length - k;
        int newArray[] = new int[nums.length];

        // First method
        int j = 0;
        for (int i = startIndex; i < nums.length; i++) {
            newArray[j++] = nums[i];
        }
        for (int i = 0; i < startIndex; i++) {
            newArray[j++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
        }

        // Second shorter method
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     newArray[(i + k) % n] = nums[i];
        // }

        // System.arraycopy(newArray, 0, nums, 0, n);
    }
}
