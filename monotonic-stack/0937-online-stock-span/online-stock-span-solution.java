class StockSpanner {
    private Deque<int[]> stack = new ArrayDeque<>();
    // 0th index stores price
    // 1st index stores span

    public StockSpanner() {
    }
    
    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}

/**
* Your StockSpanner object will be instantiated and called as such:
* StockSpanner obj = new StockSpanner();
* int param_1 = obj.next(price);

Hint:
You do not receive the full array at once.
You receive one price at a time through next(price).


 */


