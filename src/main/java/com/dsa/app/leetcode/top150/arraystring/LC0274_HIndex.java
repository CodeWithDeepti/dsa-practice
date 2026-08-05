package com.dsa.app.leetcode.top150.arraystring;

import java.util.Arrays;

// https://leetcode.com/problems/h-index/?envType=study-plan-v2&envId=top-interview-150
public class LC0274_HIndex {
    // solution 1
    public int hIndex(int[] citations) {
        int len = citations.length;
        Arrays.sort(citations);
        for(int i= 0 ; i < len ; i++){
            if(citations[i]>= (len-i)){
                return len-i ;
            }
        }
        return 0;
    }

    // solution 2
    public int hIndex2(int[] citations) {
        int[] buckets = new int[citations.length+1];
        int len = citations.length;
        for(int value : citations){
            if(value>=len){
                buckets[len]++;
            }else{
                buckets[value]++;
            }
        }
        for(int i=0; i< len ; i++){
            System.out.println(buckets[i] +"\t");
        }
        int count =0;
        for(int i = len ; i >=0 ; i--){
            count+=buckets[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}
