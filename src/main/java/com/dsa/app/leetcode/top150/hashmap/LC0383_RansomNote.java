package com.dsa.app.leetcode.top150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LC0383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> freqMap = new HashMap<>();

        for(char ch : magazine.toCharArray() ){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1) ;
        }

        for(char ch : ransomNote.toCharArray() ){
            if(!freqMap.containsKey(ch)){
                return false ;
            }
            int val = freqMap.get(ch);
            if(val==1){
                freqMap.remove(ch);
            }else{
                freqMap.put(ch,val-1) ;
            }
        }
        return true;
    }
}
