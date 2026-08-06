package com.dsa.app.leetcode.top150.arraystring;

public class LC0135_Candy {

    public int candy(int[] ratings) {
        int[] candyAllocated = new int[ratings.length];
        int total =0;
        candyAllocated[0]= 1 ;
        for(int i=1 ; i< ratings.length ; i++){
            if(ratings[i]>ratings[i-1]){
                candyAllocated[i]=candyAllocated[i-1]+1;
            }else{
                candyAllocated[i]=1 ;
            }
        }
        total += candyAllocated[candyAllocated.length-1];
        for(int i= ratings.length-2 ; i>=0 ; i--){
            if(ratings[i]>ratings[i+1] && candyAllocated[i]<=candyAllocated[i+1]){
                candyAllocated[i]= candyAllocated[i+1]+1;
            }
            total += candyAllocated[i];
        }
        return total;
    }

}
