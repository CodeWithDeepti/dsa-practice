package com.dsa.app.leetcode.top150.arraystring;

// Leetcode link
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class LC0026_RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // uses a two-pointer approach where i scans for new values and j shifts forward to overwrite duplicates in-place.
        // if a new value comes at ith index only then its value is stored in jth position otherwise just move the ith pointer forward
        int j=0;
        for(int i=1; i< nums.length; i++){
            if(nums[i]!=nums[j]){
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
}
