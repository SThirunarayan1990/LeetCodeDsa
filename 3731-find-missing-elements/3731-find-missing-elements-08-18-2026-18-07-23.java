class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missingNums = new ArrayList();
        int arr[] = new int[101];
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            arr[nums[i]]++; 
        }
        
        for(int i = min; i<=max; i++) {
            if(arr[i] != 1) {
                missingNums.add(i); 
            }
        }
        return missingNums;
    }
}