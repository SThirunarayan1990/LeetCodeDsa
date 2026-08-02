class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Set<List<Integer>> result = new HashSet<>();
        for (int i=0; i < nums.length-2; i++) {
            HashSet<Integer> set = new HashSet();
            for (int j= i+1; j < nums.length; j++) {
                int third = target - (nums[i] + nums[j]);
                if(set.contains(third)) {
                    List<Integer> combo = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(combo);
                    result.add(combo);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}