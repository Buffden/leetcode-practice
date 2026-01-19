class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxVolume = 0;

        while (left < right) {
            int prod = (right - left) * Math.min(height[right], height[left]);
            maxVolume = Math.max(maxVolume, prod);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVolume;
    }
}
