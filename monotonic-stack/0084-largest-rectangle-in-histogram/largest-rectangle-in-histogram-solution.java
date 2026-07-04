class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            // sentinel trick
            // because we want to force all remaining bars in the stack to pop
            int currentHeight = (i == n) ? 0 : heights[i]; // we are iterating to the end as if its a building as well

            while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
                int poppedIndex = stack.pop();
                int height = heights[poppedIndex];
                int rightBoundary = i;
                // If stack is empty: no smaller bar exists on the left so left boundary is -1
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek(); // in case the stack is empty
                int width = rightBoundary - leftBoundary - 1;
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
