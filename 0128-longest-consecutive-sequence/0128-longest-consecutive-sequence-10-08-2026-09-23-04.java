class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int n : nums) {
            s.add(n);
        }

        int max = 0;
        for (int n : s) {
            if (!s.contains(n - 1)) {
                int current = n;
                int count = 1;
                while (s.contains(current + 1)) {
                    current++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}