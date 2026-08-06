class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean visited[] = new boolean[nums.length];
        backtrack(res, nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> ns = new ArrayList();
            for (int n : nums) {
                ns.add(n);
            }
            res.add(ns);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            backtrack(res, nums, index + 1);
            swap(nums, index, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}