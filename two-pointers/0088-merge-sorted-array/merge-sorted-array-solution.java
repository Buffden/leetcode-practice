import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index2 = n - 1;
        int index1 = m - 1;
        int bigIndex = m + n - 1;

        while (index2 >= 0 && index1 >= 0) {
            if (nums1[index1] <= nums2[index2]) {
                nums1[bigIndex] = nums2[index2];
                index2--;
            } else {
                nums1[bigIndex] = nums1[index1];
                index1--;
            }
            bigIndex--;
            
        }
        while (index2 >= 0) {
            nums1[bigIndex--] = nums2[index2--];
        }
        
    }
}
