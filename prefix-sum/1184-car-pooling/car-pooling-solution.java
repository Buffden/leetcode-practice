class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
        List<int[]> res = new ArrayList<>(); // add allowed trips
        res.add(trips[0]);
        int currentPassengers = 0;

        int[] changes = new int[1001];

        // passenger changes at each location
        for (int[] trip : trips) {
            int passengers = trip[0];
            int pickup = trip[1];
            int dropoff = trip[2];

            changes[pickup] += passengers;
            changes[dropoff] -= passengers;
        }

        // iterate through each location in order
        for (int location = 0; location < changes.length; location++) {
            currentPassengers += changes[location];

            if (currentPassengers > capacity) {
                return false;
            }
        }

        return true;

    }
}
