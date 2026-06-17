class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Hint: 
        // Store index when position matters
        // Store value when only value to value mapping matters

        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> nextGreater = new HashMap<>();
        int[] ans = new int[nums1.length];

        // processing nums2
        for (int num: nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                int smaller = stack.pop(); // popping smaller items as we are maintaining decreasing stack for next greater element questions
                nextGreater.put(smaller, num); // num is the next greater element for the poped item which is int smaller
            }
            stack.push(num);
        }

        // nums1 is considered here to ask questions to the Map nextGreater
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}
