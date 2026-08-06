class Solution {
      public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList());
        Arrays.sort(nums);

        for (int n : nums) {
            HashSet<List<Integer>> temp = new HashSet<>();
            for (List<Integer> existingNum : res) {
                for (int j = 0; j <= existingNum.size(); j++) {
                    List<Integer> s = new ArrayList(existingNum);
                    s.add(j, n);
                    temp.add(s);
                }
            }
            res = new ArrayList(temp);
        }
        return res;
    }
}