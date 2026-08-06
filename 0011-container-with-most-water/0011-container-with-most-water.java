class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length - 1;

        while ( start < end) {
            int area = 0;
            if(height[start] < height[end]) {
               area = height[start] * (end-start);
               start++;
            } else {
               area = height[end] * (end-start);
               end--; 
            }
               maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}