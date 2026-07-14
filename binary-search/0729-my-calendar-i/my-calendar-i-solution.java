class MyCalendar {
    private final List<int[]> bookings;
    public MyCalendar() {
        this.bookings = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for (int[] booking: bookings) {
            int existingStart = booking[0];
            int existingEnd = booking[1];
            if (startTime < existingEnd && endTime > existingStart) {
                return false;
            }
        }
        bookings.add(new int[]{startTime, endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */
