class Solution {
    class State {
        boolean s1 = false;
        boolean s2 = false;
        boolean s3 = false;

        public void markAllocated(int seat) {
            if (between(2, 5, seat))
                s1 = true;
            if (between(4, 7, seat))
                s2 = true;
            if (between(6, 9, seat))
                s3 = true;
        }

        boolean between(int a, int b, int seat) {
            return seat >= a && seat <= b;
        }

        int count() {
            if (!s2) {
                return (!s1 && !s3) ? 2 : 1;
            }

            int count = 0;
            if (!s1)
                count++;
            if (!s3)
                count++;

            return count;
        }
    }

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, State> mp = new HashMap<>();

        for (int[] a : reservedSeats) {
            State s = mp.computeIfAbsent(a[0], k -> new State());
            s.markAllocated(a[1]);
        }

        int res = (n - mp.size()) * 2;

        for (State s : mp.values()) {
            res += s.count();
        }

        return res;
    }

}