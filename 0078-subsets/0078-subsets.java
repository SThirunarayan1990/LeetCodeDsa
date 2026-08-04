class Solution {
      public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subsetRec(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void subsetRec(List<List<Integer>> res, List<Integer> curr, int[] nums, int idx) {
        res.add(new ArrayList<>(curr));
        for (int i = idx; i < nums.length; i++) {
            curr.add(nums[i]);
            subsetRec(res, curr, nums, i+1);
            curr.remove(curr.size() - 1);
        }
    }
}