package com.dsa.app.leetcode.top150.hashmap;

import java.util.*;

public class LC0049_GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();

        Map<String,List<String>> anagramMap = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];
            for(char ch:str.toCharArray()){
                count[ch-'a']++ ;
            }
            String signature = Arrays.toString(count);

            anagramMap.computeIfAbsent(signature,k->new ArrayList<String>())
                    .add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
