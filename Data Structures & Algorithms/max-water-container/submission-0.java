class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1,maxArea=0;
        while(left<right){
            int height=Math.min(heights[left],heights[right]);
            int width=right-left;
            int Area=height*width;
            maxArea=Math.max(Area,maxArea);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
              right--;
            }
        }
        return maxArea;

        
    }
}
