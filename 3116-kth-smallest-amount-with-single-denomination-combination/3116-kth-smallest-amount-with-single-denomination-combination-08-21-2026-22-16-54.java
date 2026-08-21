class Solution {
    long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    // Generates every subset using recursion
    long count(long x, int[] denominations, int index, long currentLcm, int selected) {

        // We have considered all denominations
        if (index == denominations.length) {

            // No denomination selected
            if (selected == 0) {
                return 0;
            }

            long ways = x / currentLcm;

            // Odd number selected -> ADD
            if (selected % 2 == 1) {
                return ways;
            }

            // Even number selected -> SUBTRACT
            return -ways;
        }

        // Option 1: Don't select current denomination
        long notTake = count(x, denominations, index + 1, currentLcm, selected);

        // Option 2: Select current denomination
        long newLcm = lcm(currentLcm, denominations[index]);

        long take = count(x, denominations, index + 1, newLcm, selected + 1);

        return notTake + take;
    }

    long count(long x, int[] denominations) {
        return count(x, denominations, 0, 1, 0);
    }

    long findKthSmallest(int[] denominations, int k) {

        long min = Long.MAX_VALUE;

        for (long d : denominations) {
            min = Math.min(min, d);
        }

        long low = 1;
        long high = min * k;

        while (low < high) {

            long mid = low + (high - low) / 2;

            long cnt = count(mid, denominations);

            if (cnt >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

}