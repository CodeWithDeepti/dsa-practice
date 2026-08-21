package com.dsa.app.leetcode.top150.hashmap;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150
public class LC0202_HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
            n=getSquareNumber(n);
        }
        return n==1 ;
    }

    int getSquareNumber(int num){
        int sum =0;
        int remainder =0;
        while(num>0){
            remainder = num%10 ;
            sum+= (remainder*remainder);
            num=num/10;
        }
        return sum;
    }
}
