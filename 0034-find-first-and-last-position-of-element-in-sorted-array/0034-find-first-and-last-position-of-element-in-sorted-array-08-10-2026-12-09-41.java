class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = { -1, -1 };

        res[0] = findFirst(nums, target, 0, nums.length - 1);
        res[1] = findLast(nums, target, 0, nums.length - 1);

        return res;
    }

    private int findFirst(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            int left = findFirst(nums, target, start, mid - 1);
            return left == -1 ? mid : left;
        }

        if (target < nums[mid]) {
            return findFirst(nums, target, start, mid - 1);
        }

        return findFirst(nums, target, mid + 1, end);
    }

    private int findLast(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            int right = findLast(nums, target, mid + 1, end);
            return right == -1 ? mid : right;
        }

        if (target < nums[mid]) {
            return findLast(nums, target, start, mid - 1);
        }

        return findLast(nums, target, mid + 1, end);
    }
}