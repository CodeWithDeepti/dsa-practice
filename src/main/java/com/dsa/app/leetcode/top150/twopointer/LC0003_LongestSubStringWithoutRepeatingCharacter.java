package com.dsa.app.leetcode.top150.twopointer;

import java.util.HashSet;
import java.util.Set;

public class LC0003_LongestSubStringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 , right = 0 ;
        int windowSize = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()){
            if(set.contains(s.charAt(right))){
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(right));
            windowSize = Math.max(windowSize,right-left+1);
            right++;
        }

        return windowSize;
    }

    // write a main method to test the lengthOfLongestSubstring function
    public static void main(String[] args) {
        LC0003_LongestSubStringWithoutRepeatingCharacter obj = new LC0003_LongestSubStringWithoutRepeatingCharacter();
        String s = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println(result); // Output: 3
    }
}
