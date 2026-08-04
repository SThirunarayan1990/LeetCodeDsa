class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        int start = 0;
        int end = res.size() - 1;
        for (int i = start; i < nums.length; i++) {
            int size = res.size();
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            } else {
                start = 0;
            }
            end = res.size() - 1;
            for (int j = start; j < size; j++) {
                List<Integer> subset = new ArrayList<>(res.get(j));
                subset.add(nums[i]);
                res.add(subset);
            }
        }
        return res;
    }
}