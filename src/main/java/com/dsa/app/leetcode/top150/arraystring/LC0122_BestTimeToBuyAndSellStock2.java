package com.dsa.app.leetcode.top150.arraystring;

public class LC0122_BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[prices.length-1];
        int sell= buy;
        for(int i= prices.length-2 ; i>=0 ;i--){
            if(prices[i]<=buy){
                buy= prices[i];
            }else{
                profit +=(sell-buy);
                sell=prices[i];
                buy=prices[i];
            }
        }
        profit +=(sell-buy);
        return profit ;
    }
}
