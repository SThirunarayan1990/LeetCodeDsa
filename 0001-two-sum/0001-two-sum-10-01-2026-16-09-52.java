class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap();
        for (int i=0; i< nums.length; i++) {
            int toFind = target - nums[i];
            if (m.containsKey(toFind)) {
                return new int[]{m.get(toFind), i};
            } else {
                m.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}