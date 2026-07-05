class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > c) {
                stack.pollLast();
                k--;
            }

            stack.offerLast(c);
        }
        while (k > 0) {
            stack.pollLast();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        boolean leadingZero = true;

        while (!stack.isEmpty()) {
            char leadingChar = stack.pollFirst();

            if (leadingZero && leadingChar == '0') {
                continue;
            }

            leadingZero = false;
            ans.append(leadingChar);
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}
