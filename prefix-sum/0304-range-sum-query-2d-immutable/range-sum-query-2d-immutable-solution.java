class NumMatrix {
    int[][] prefix; // global

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        prefix = new int[rows + 1][cols + 1];

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                prefix[row][col] = matrix[row - 1][col - 1] + prefix[row - 1][col] + prefix[row][col - 1] - prefix[row - 1][col - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix[row2 + 1][col2 + 1] - prefix[row1][col2 + 1] - prefix[row2 + 1][col1] + prefix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
