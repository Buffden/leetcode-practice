class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];

        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows[i] = new StringBuilder();
        }

        boolean moveDown = false;
        int currentRow = 0;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction if we're at the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                moveDown = !moveDown;
            }
            currentRow += moveDown ? 1 : -1;
        }

        // Combine all rows into one string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
