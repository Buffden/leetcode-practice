class MyCalendarTwo {
    private final List<int[]> bookings;
    private final List<int[]> doubleBookings;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        doubleBookings = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {

        // if the new booking overlaps an already double-booked range,
        // it would create a triple booking
        for (int[] overlap: doubleBookings) {
            int overlapStart = overlap[0];
            int overlapEnd = overlap[1];

            if (startTime < overlapEnd && endTime > overlapStart) {
                return false;
            }
        }

        // find overlaps with existing bookings
        // each overlap becomes a double-booked range
        for (int[] booking : bookings) {
            int existingStart = booking[0];
            int existingEnd = booking[1];

            if (startTime < existingEnd && endTime > existingStart) {
                int newOverlapStart = Math.max(startTime, existingStart);
                int newOverlapEnd = Math.min(endTime, existingEnd);

                doubleBookings.add(new int[]{newOverlapStart, newOverlapEnd});
            }
        }

        bookings.add(new int[]{startTime, endTime});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */
