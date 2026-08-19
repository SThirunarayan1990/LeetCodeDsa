class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Integer> rows = new HashMap<>();

        for (int[] r : reservedSeats) {
            int row = r[0];
            int seat = r[1];

            /*We're converting seat numbers 2 through 9 into bits 0 through 7.
            Seat	Bit
            2	    00000001
            3	    00000010
            
            if bit is 00000011 meanns both 2 and 3 seats are occupied
             */
            if (seat >= 2 && seat <= 9) {
                rows.put(row, rows.getOrDefault(row, 0) | (1 << (seat - 2)));
            }
        }

        int ans = (n - rows.size()) * 2;

        int left = 0b00001111; // 2-5
        int middle = 0b00111100; // 4-7
        int right = 0b11110000; // 6-9

        for (int mask : rows.values()) {

            boolean leftFree = (mask & left) == 0;
            boolean middleFree = (mask & middle) == 0;
            boolean rightFree = (mask & right) == 0;

            if (leftFree && rightFree)
                ans += 2;
            else if (leftFree || middleFree || rightFree)
                ans += 1;
        }

        return ans;

    }

}