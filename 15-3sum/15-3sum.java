class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result=new ArrayList<>();
        int sum =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            else{
            
           while(j<k){
               sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                      result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(nums[j]==nums[j-1]&& j<k){
                        j++;
                    }
                   /*while(nums[k]==nums[k-1]&& j<k){
                        k--;
                    }*/
                }
                    else if(sum<0){
                        j++;
                    }
               else if(sum>0){
                   k--;   
               }
               }
            }
           }
        
        return result;
    }
}