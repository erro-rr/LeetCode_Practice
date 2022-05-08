class Solution {
    public int maxArea(int[] height) {
      /*  int Area=0;
        for(int i=0;i<height.length;i++){
            for(int j=height.length-1;j>=0;j--){
                Area=Math.max(Area,Math.min(height[i],height[j])*(j-i));
            }
        }
        return Area; 
        */
        
        
        
        // Complexity should be O(n)
        
       int Area=0;
        int n=height.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            Area=Math.max(Area,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j])
                i++;
            else{
                j--;
            }
        }
        
        return Area;
    }
}