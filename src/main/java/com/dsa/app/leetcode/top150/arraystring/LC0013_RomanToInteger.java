package com.dsa.app.leetcode.top150.arraystring;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/?envType=study-plan-v2&envId=top-interview-150

public class LC0013_RomanToInteger {
    public int romanToInt(String s) {
        Map<Character,Integer> map = getRomanToIntegerMap();
        int num =0 , i=0;
        for(  ; i< s.length()-1 ; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                num += ( map.get(s.charAt(i+1)) - map.get(s.charAt(i))) ;
                i++;
            }else{
                num += map.get(s.charAt(i)) ;
            }
        }

        if(i== s.length()-1){
            num += map.get(s.charAt(i)) ;
        }
        return num;
    }

    public Map<Character,Integer> getRomanToIntegerMap(){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        return map;
    }

}
