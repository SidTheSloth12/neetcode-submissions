class Solution {
    public int maxArea(int[] heights) {
        int max=Math.min(heights[0],heights[1]);
        int i=0,j=heights.length-1;
        while(i<j){
            int q=(j-i)*(Math.min(heights[j],heights[i]));
            max=Math.max(max,q);
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
