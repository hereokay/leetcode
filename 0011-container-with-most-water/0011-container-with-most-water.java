class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int maxi = Integer.MIN_VALUE;
        while (left < right){
            int area = calcArea(height, left, right);
            if (area > maxi){
                maxi = area;
            }
            if (height[left] > height[right]){
                right -=1;
            }
            else {
                left +=1;
            }
        }
        return maxi;
    }
    public int calcArea(int[] height, int left, int right){
        int w = right - left;
        int h = Math.min(height[left],height[right]);

        return w*h;
    }
}
