class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> resultHash = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
             HashSet<Integer> m = new HashSet();
            if (nums[i] > 0)
                break;

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);
                if (m.contains(third)) {
                    resultHash.add(List.of(nums[i], nums[j], third));
                } else {
                    m.add(nums[j]);
                }
            }
        }
        return new ArrayList(resultHash); 
    }
}