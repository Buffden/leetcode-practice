class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int previousEnd = intervals[0][1];
        // the loop starts from index 1 to compare the second interval against it the first one that we used above
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < previousEnd) {
                count++;
            } else {
                previousEnd = intervals[i][1];
            }
        }
        return count;
    }
}
