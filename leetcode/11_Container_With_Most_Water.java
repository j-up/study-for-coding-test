class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_area = Math.min(height[left], height[right]) * (right - left);

        while (left < right) {
            System.out.println("height[left]: " + height[left] + ", height[right]: " + height[right]);
            System.out.println("left: " + left + " right: " + right);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }

            int area = Math.min(height[left], height[right]) * (right - left);
            max_area = Math.max(max_area, area);
        }

        return max_area;
    }
}