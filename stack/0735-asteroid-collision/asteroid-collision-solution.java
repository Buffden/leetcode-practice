class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (alive && !stack.isEmpty() && stack.peekLast() > 0 && asteroid < 0) {
                int top = stack.peekLast();

                if (Math.abs(top) < Math.abs(asteroid)) {
                    stack.pollLast(); // current asteroid survives for now, keep checking
                } else if (Math.abs(top) == Math.abs(asteroid)) {
                    stack.pollLast();
                    alive = false; // both destroyed
                } else {
                    alive = false; // current asteroid destroyed
                }
            }

            if (alive) {
                stack.offerLast(asteroid);
            }
        }

        int[] ans = new int[stack.size()];
        int index = 0;

        while (!stack.isEmpty()) {
            ans[index++] = stack.pollFirst();
        }

        return ans;
    }
}
