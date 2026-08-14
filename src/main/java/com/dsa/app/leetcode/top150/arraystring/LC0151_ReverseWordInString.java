package com.dsa.app.leetcode.top150.arraystring;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
public class LC0151_ReverseWordInString {

    // Approach 1: Using StringBuilder and List to store words and reverse them
    public String reverseWords(String s) {
        s = s.trim();
        char[] chs= s.toCharArray();
        int i=0;
        List<StringBuilder> lst = new ArrayList<>();
        while(true){
            while(i<chs.length && chs[i]==' ' ){
                i++;
            }
            StringBuilder sb = new StringBuilder();
            while(i<chs.length && chs[i]!=' ' ){
                sb.append(chs[i]);
                i++;
            }
            lst.add(sb);
            if(i==chs.length)
                break;
        }

        StringBuilder result = new StringBuilder();
        for(int j= lst.size()-1 ; j>=0 ;j--){
            result.append(lst.get(j)).append(" ");
        }
        return result.toString().trim();
    }

    //Approach 2: Using split and StringBuilder to reverse words
        public String reverseWords2(String s) {
            String[] words = s.trim().split("\\s+"); // split by one or more spaces
            StringBuilder result = new StringBuilder();
            for(int i = words.length - 1; i >= 0; i--) {
                result.append(words[i]).append(" ");
            }
            return result.toString().trim();
        }

    // Approach 3: Using two pointers to reverse words without extra space
        public String reverseWords3(String s) {
            StringBuilder result = new StringBuilder();
            int i = s.length() - 1;

            while(i >= 0) {
                while(i >= 0 && s.charAt(i) == ' ') i--; // skip spaces
                int j = i;
                while(j >= 0 && s.charAt(j) != ' ') j--; // find word start
                if(i >= 0) {
                    result.append(s.substring(j + 1, i + 1)).append(" ");
                }
                i = j - 1;
            }

            return result.toString().trim();
        }



}
