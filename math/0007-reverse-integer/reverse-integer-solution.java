class Solution {
    public int reverse(int x) {
        if (x == 0 || x / 10 == 0) return x;

        boolean isNegative = x < 0;
        x = Math.abs(x);

        StringBuilder res = new StringBuilder();

        while (true) {
            if (x / 10 == 0) {
                res.append(x);
                break;
            }
            res.append(x % 10);
            x /= 10;
        }

        try {
            int reversed = Integer.parseInt(res.toString());
            return isNegative ? -reversed : reversed;
        } 
        catch (NumberFormatException e) {
            return 0;
        }
    }
}
