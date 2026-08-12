package com.dsa.app.leetcode.top150.arraystring;

import java.util.Arrays;

public class LC0014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();
        for(int i=0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int  j=1 ; j < strs.length ;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=ch){
                    return output.toString();
                }
            }
            output.append(ch);
        }
        return output.toString();
    }

        // Another approach to solve the problem using sorting and comparing the first and last strings in the sorted array
        public String longestCommonPrefix2(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            Arrays.sort(strs);
            String first = strs[0], last = strs[strs.length - 1];
            int i = 0;
            while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
                i++;
            }
            return first.substring(0, i);
        }



    // write a main method to test the above function
    public static void main(String[] args) {
        LC0014_LongestCommonPrefix obj = new LC0014_LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(obj.longestCommonPrefix(strs)); // Output: "fl"
    }
}
