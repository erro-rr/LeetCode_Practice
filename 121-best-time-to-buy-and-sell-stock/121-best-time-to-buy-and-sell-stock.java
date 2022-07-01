/*import java.util.*;
class Solution {
    //Brute Forrce Approach
    
    public int maxProfit(int[] prices) {
        int Maxpro=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
             if(prices[j]>prices[i]){
                 if((prices[j]-prices[i])>Maxpro)
                // Maxpro=Math.max(prices[j]-prices[i],Maxpro);
                     Maxpro=prices[j]-prices[i];
             }
        }
    }
         return Maxpro;
    }
} */


import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int Maxpro=0;
        int Minprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            Minprice=Math.min(Minprice,prices[i]);
             Maxpro=Math.max((prices[i]-Minprice),Maxpro);
        }
         return Maxpro;
    }
}