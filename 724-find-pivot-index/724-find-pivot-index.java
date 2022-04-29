class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            
        }
        int leftsum=0;
        int rigthsum=0;
        for(int i=0;i<nums.length;i++){
        if(leftsum==sum-leftsum-nums[i]){
            return i;
        }
           leftsum=leftsum+nums[i]; 
            
        }
        return -1;
    }
}