class Solution {
    public boolean isHappy(int n) {
        int slow = sqSum(n);
        int fast = sqSum(sqSum(n));

        while (slow != fast) {
            slow = sqSum(slow);
            fast = sqSum(sqSum(fast));
        }
        return slow == 1;
    }

    public static int sqSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
