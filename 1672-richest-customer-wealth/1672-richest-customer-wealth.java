class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=Integer.MIN_VALUE;
        for(int r=0;r<accounts.length;r++){
             int sum=0;
            for(int c=0;c<accounts[r].length;c++){
                sum=sum+accounts[r][c];
            }
             if(sum>wealth){
                    wealth=sum;
                }
        }
        return wealth;
    }
}