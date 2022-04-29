class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int element=nums[0];
        int m=nums.length/2;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count+=1;
                if(count>m){
                    break;
                }
            }else{
                count=1;
                 element=nums[i];
            }
        }
        return element;
    }
}