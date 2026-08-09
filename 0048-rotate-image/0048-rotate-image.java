class Solution {
public void rotate(int[][] m) {
        int size = m.length;

        for (int r = 0; r < size / 2; r++) {
            for (int c = r; c < size - r - 1; c++) {
                int temp = m[r][c];

                // top <- left
                m[r][c] = m[size - c - 1][r];

                // left <- bottom
                m[size - c - 1][r] = m[size - r - 1][size - c - 1];

                // bottom <- right
                m[size - r - 1][size - c - 1] =
                        m[c][size - r - 1];

                // right <- top
                m[c][size - r - 1] = temp;
            }
        }
    }
}