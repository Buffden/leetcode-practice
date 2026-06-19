class Solution {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans = Arrays.copyOf(prices, prices.length); // we need original price in case of no smaller price ahead

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int discountIndex = stack.pop();
                ans[discountIndex] = prices[discountIndex] - prices[i];
            }
            stack.push(i);
        }
        return ans;
    }
}
