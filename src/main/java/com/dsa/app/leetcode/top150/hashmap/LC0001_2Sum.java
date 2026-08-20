package com.dsa.app.leetcode.top150.hashmap;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
public class LC0001_2Sum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0; i<nums.length ; i++){
            if(indexMap.containsKey(target-nums[i])){
                return new int[]{indexMap.get(target-nums[i]),i};
            }
            indexMap.put(nums[i],i);
        }
        return new int[2];
    }
}
