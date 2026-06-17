class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // circular array means we can simulate the array twice 
        // but nums = nums.concat(nums) is a space wasting approach
        
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        
        for (int i = 0; i < nums.length * 2; i++) {
            int realIndex = i % nums.length;
            while (!stack.isEmpty() && nums[stack.peek()] < nums[realIndex]) {
                int index = stack.pop();
                ans[index] = nums[realIndex];
            }
            // because every original index should enter the stack only once
            if (i < nums.length) {
                stack.push(realIndex);
            }
            
        }
        return ans;
    }
}
