class Solution {
    public void rotate(int[][] m) {
        int n = m.length;
        // Transpose the matrix
        for (int r = 0; r < n; r++) {
            for (int c = r; c < n; c++) {
                int temp = m[r][c];
                m[r][c] = m[c][r];
                m[c][r] = temp;
            }
        }

        // Reverse every row
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n / 2; c++) {
                int temp = m[r][c];
                m[r][c] = m[r][n - c - 1];
                m[r][n - c - 1] = temp;
            }
        }
    }
}