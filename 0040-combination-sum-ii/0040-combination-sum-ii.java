class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList();
        backtrack(res, new ArrayList(), candidates, target, 0, 0);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> curr, int[] candidates, int target, int sum, int index) {
        if (target == sum) {
            res.add(new ArrayList(curr));
            return;
        }
        if (index == candidates.length || sum > target) {
            return;
        }
        curr.add(candidates[index]);
        backtrack(res, curr, candidates, target, sum + candidates[index], index + 1);
        curr.remove(curr.size() - 1);
        while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        backtrack(res, curr, candidates, target, sum, index + 1);
    }
}