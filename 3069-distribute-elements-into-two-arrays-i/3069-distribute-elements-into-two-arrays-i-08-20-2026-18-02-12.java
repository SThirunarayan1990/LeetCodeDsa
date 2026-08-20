class Solution {
    public int[] resultArray(int[] nums) {
        int n1[] = new int[nums.length];
        int n2[] = new int[nums.length];
        n1[0] = nums[0];
        n2[0] = nums[1];
        int a = 0;
        int b = 0;
        for (int i = 2; i < nums.length; i++) {
            if (n1[a] > n2[b]) {
                a = a + 1;
                n1[a] = nums[i];
            } else {
                b = b + 1;
                n2[b] = nums[i];
            }
        }

        for (int i = 0; i <= b; i++) {
            a = a + 1;
            n1[a] = n2[i];
        }
        return n1;
    }
}