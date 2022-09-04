class Solution {
    public int search(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);
        
    }
    public int search(int[] nums,int start,int end,int target){
        int mid=start+(end-start)/2;
        while(start<=end){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                return search(nums,start,mid-1,target);
            }
            else{
                return search(nums,mid+1,end,target);
            }
        }
        return -1;
    }
}