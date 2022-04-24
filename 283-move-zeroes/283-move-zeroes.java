class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=-1;
        int j=0;
        while(j<n){
            if(nums[j]!=0){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            else
                j++;
        }
        
    }
}