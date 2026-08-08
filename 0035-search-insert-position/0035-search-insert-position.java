class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums, target, 0, nums.length - 1);
    }

    public int searchInsert(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start;
        }
        int midIndex = start + (end - start) / 2;
        if (target == nums[midIndex]) {
            return midIndex;
        }
        if (target < nums[midIndex]) {
            return searchInsert(nums, target, start, midIndex - 1);
        }
        return searchInsert(nums, target, midIndex + 1, end);
    }
}