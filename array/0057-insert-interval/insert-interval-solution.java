class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for (int[] cur: intervals) {
            // current interval is completely before newInterval
            if (cur[1] < newInterval[0]) {
                res.add(cur);
            } 
            // current interval is completely after newInterval
            else if (newInterval[1] < cur[0]) { 
                res.add(newInterval);
                newInterval = cur;
            }
            // current interval overlaps newInterval
            else {
                newInterval[0] = Math.min(newInterval[0], cur[0]);
                newInterval[1] = Math.max(newInterval[1], cur[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}
