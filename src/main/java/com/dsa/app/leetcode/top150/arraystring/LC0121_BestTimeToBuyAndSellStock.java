package com.dsa.app.leetcode.top150.arraystring;

public class LC0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit =0;
        int profit = 0;
        int maxPrice=0;
        for(int i= prices.length-1 ; i>=0 ; i--){
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
            }
            profit = maxPrice-prices[i] ;
            if(profit >maxProfit)
            {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
