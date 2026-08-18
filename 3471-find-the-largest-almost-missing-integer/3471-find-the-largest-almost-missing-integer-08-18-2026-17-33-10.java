class Solution {
    public int largestInteger(int[] nums, int k) {
        int res = -1;
        HashMap<Integer, Integer> numCountMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            numCountMap.put(nums[i], numCountMap.getOrDefault(nums[i], 0) + 1);
        }

        if (k == 1) {
            int max = -1;
            for (int i = 0; i < nums.length; i++) {
                if (numCountMap.get(nums[i]) == 1) {
                    max = Math.max(nums[i], max);
                }
            }
            return max;
        }

        if (k == nums.length) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(nums[i], max);
            }
            return max;
        }
        int n = nums.length - 1;
        if (numCountMap.get(nums[0]) > 1 && numCountMap.get(nums[n]) > 1) {
            res = -1;
        }
        if (numCountMap.get(nums[0]) > 1 && numCountMap.get(nums[n]) == 1) {
            res = nums[n];
        }
        if (numCountMap.get(nums[0]) == 1 && numCountMap.get(nums[n]) > 1) {
            res = nums[0];
        }
        if (numCountMap.get(nums[0]) == 1 && numCountMap.get(nums[n]) == 1) {
            res = Math.max(nums[0], nums[n]);
        }
        return res;
    }
}