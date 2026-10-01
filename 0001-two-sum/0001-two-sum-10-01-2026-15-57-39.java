class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap();
        for (int i=0; i< nums.length; i++) {
            int toFind = target - nums[i];
            Integer ind = m.get(toFind);
            if (m.get(toFind) != null) {
                return new int[]{ind, i};
            } else {
                m.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}