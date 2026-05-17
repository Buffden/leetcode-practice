class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int w: weights) {
            low = Math.max(low, w);
            high += w;
        }
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, mid) <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int canShip(int[] weights, int speed) {
        int usedDays = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > speed) {
                usedDays++;
                currentLoad = 0;
            }

            currentLoad += w;
        }
        return usedDays;
    }
}
