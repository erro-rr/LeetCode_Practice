class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int i;
        int BP=prices[0];
        for(i=1;i<prices.length;i++){
            if(prices[i]<prices[i-1]){
                profit=profit+(prices[i-1]-BP);
                BP=prices[i];
            }
        }
        profit=profit+(prices[i-1]-BP);
        return profit;
        
    }
}