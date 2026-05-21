class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // binary search
        // peak is when the left and right element are smaller
        // direction changes at this peak index

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
