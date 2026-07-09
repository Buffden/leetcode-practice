class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrowCount = 1;
        int arrowPoint = points[0][1];

        for (int i = 1; i < points.length; i++) {

            // Current arrow cannot reach this balloon
            if (points[i][0] > arrowPoint) {
                arrowCount++;
                arrowPoint = points[i][1];
            }

            // Otherwise, the current arrow bursts this balloon too
        }

        return arrowCount;
    }
}
