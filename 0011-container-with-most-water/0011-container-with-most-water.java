class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int water = 0;
        while (l < r) {
            int c = r - l;
            if (height[l] < height[r]) {
                water = Math.max(water, height[l] * c);
                l++;
            } else if (height[l] > height[r]) {
                water = Math.max(water, height[r] * c);
                r--;
            } else {
                water = Math.max(water, height[l] * c);
                l++;

            }
        }
        return water;
    }
}