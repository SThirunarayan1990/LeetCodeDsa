class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Integer> mp = new HashMap<>();

        /*We're converting seat numbers 2 through 9 into bits 2 through 9 bits only.
        Bit position:   10  9  8  7  6  5  4  3  2  1  0
                        ↓   ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓  ↓
        Seat number:        9  8  7  6  5  4  3  2  1
        
        so for 2 : 00000000100
        so for 3 : 00000001000
        if(2 and 3 occuppied) means: 00000001100 
         */
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            mp.put(row, mp.getOrDefault(row, 0) | (1 << col));
        }

        int LEFT = (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5);
        int MIDDLE = (1 << 4) | (1 << 5) | (1 << 6) | (1 << 7);
        int RIGHT = (1 << 6) | (1 << 7) | (1 << 8) | (1 << 9);

        int total = 2 * n;

        for (int mask : mp.values()) {

            boolean left = (mask & LEFT) == 0;
            boolean middle = (mask & MIDDLE) == 0;
            boolean right = (mask & RIGHT) == 0;

            if (left && right) {
                continue;
            }

            if (left || middle || right) {
                total--;
            } else {
                total -= 2;
            }
        }

        return total;
    }

}