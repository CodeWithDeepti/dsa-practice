package com.dsa.app.leetcode.top150.arraystring;

public class LC0028_IndexOfFirstOccuranceOfString {
    public int strStr(String haystack, String needle) {
        int len = haystack.length() - needle.length()  ;
        int nedlen = needle.length();
        for(int i=0 ; i<= len ; i++){
            if(needle.equals(haystack.substring(i,i+nedlen))){
                return i;
            }
        }
        return -1;
    }
}
