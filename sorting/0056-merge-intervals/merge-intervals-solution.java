class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        for (int[] cur : intervals) {

            // Empty result or no overlap with the previous interval
            if (res.isEmpty() || res.get(res.size() - 1)[1] < cur[0]) {
                res.add(cur);

            } else {
                // Overlaping - extend the previous intervals ending
                int[] previous = res.get(res.size() - 1);
                previous[1] = Math.max(previous[1], cur[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
