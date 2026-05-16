class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // min speed of banana eating per hr
        // min speed canbe 1 and max should not be more than the max value of the array elements
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; //speed

            if (canEat(piles, mid) <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public long canEat(int[] piles, int speed) {
        long time = 0;
        for (int p: piles) {
            time += (int) Math.ceil(1.0 * p / speed);
        }
        return time;
    }
}
