class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1, max = Integer.MIN_VALUE;

        while(l < r) {
            if(height[l] < height[r]) {
                if(max < height[l] * (r - l)) {
                    max = height[l] * (r - l);
                }
                l++;
            } else {
                if(max < height[r] * (r - l)) {
                    max = height[r] * (r - l);
                }
                r--;
            }
        }
        return max;
    }
}