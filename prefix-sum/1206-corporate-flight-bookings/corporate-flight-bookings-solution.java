class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n];
        int prefix = 0;

        for (int i = 0; i < bookings.length; i++) {
            int left = bookings[i][0] - 1;
            int right = bookings[i][1] - 1;
            int score = bookings[i][2];

            diff[left] += score;
            if (right + 1 < n) {
                diff[right + 1] -= score;
            }
        }

        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }

        return diff;
    }
}
