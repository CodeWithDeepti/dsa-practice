package com.dsa.app.leetcode.top150.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/?envType=study-plan-v2&envId=top-interview-150

public class LC0015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        int left , right ,sum;
        for(int i=0; i< nums.length-2 ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue ;
            left = i+1 ; right = nums.length-1;
            while(left < right) {
                sum = nums[i]+ nums[left]+nums[right];
                if( 0 ==sum ){
                    List<Integer> lst = Arrays.asList(nums[i],nums[left], nums[right]);
                    output.add(lst);
                    while(left<right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    while(left< right && nums[right]==nums[right-1]) {
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum <0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return output;
    }
}
