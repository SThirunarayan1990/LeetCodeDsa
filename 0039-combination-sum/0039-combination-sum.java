class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList();
        backtrack(res, new ArrayList(), candidates, target, 0, 0);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> curr, int[] candidates, int target, int sum, int index) {
        if (index == candidates.length || sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(candidates[index]);
        backtrack(res, curr, candidates, target, sum + candidates[index], index);
        curr.remove(curr.size() - 1);
        backtrack(res, curr, candidates, target,
                sum, index + 1);
    }
}