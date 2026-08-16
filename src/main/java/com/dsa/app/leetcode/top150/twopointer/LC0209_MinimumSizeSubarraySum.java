package com.dsa.app.leetcode.top150.twopointer;

public class LC0209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int windowSize = Integer.MAX_VALUE ;
        int left = 0 , right = 0 , currSum = 0;
        while(left<  nums.length && right < nums.length){
            currSum += nums[right];
            while(currSum >= target ){
                windowSize = Math.min(windowSize, right-left+1);
                currSum = currSum - nums[left];
                left++;
            }
            right++;
        }

        return windowSize==Integer.MAX_VALUE ? 0 : windowSize ;
    }

    // main method to test the minSubArrayLen function
    public static void main(String[] args) {
        LC0209_MinimumSizeSubarraySum obj = new LC0209_MinimumSizeSubarraySum();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int result = obj.minSubArrayLen(target, nums);
        System.out.println(result); // Output: 2
    }
}
