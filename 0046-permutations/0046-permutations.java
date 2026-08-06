class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList());

        for (int i : nums) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> existingNum : res) {
                for (int j = 0; j <= existingNum.size(); j++) {
                    List<Integer> newList = new ArrayList<>(existingNum);
                    newList.add(j, i);
                    temp.add(newList);
                }
            }
            res = temp;
        }
        return res;
    }
}