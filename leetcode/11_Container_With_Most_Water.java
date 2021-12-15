class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;


        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int area = Math.min(height[i],height[j]) * (j-i);
                maxArea = Math.max(maxArea,area);
            }
        }

        return maxArea;
    }
}