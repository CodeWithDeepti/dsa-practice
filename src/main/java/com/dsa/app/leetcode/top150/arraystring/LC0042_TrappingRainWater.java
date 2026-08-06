package com.dsa.app.leetcode.top150.arraystring;

// https://leetcode.com/problems/trapping-rain-water/submissions/?envType=study-plan-v2&envId=top-interview-150
public class LC0042_TrappingRainWater {

    // Approach 1: Using two arrays to store the left and right max heights
    public int trap(int[] height) {
        int[] leftPeek = new int[height.length];
        int[] rightPeek = new int[height.length];

        int left =0,right=0;
        for(int i=0 ; i < height.length ; i++){
            if(height[i]>left){
                leftPeek[i]=height[i];
                left= height[i];
            }else{
                leftPeek[i] = left;
            }
        }

        for(int i=height.length-1 ; i >=0 ; i--){
            if(height[i]>right){
                rightPeek[i]=height[i];
                right= height[i];
            }else{
                rightPeek[i]=right;
            }
        }

        int water=0;

        for(int i=0; i<height.length; i++){
            water += (Math.min(leftPeek[i],rightPeek[i]) - height[i]);
        }

        return water;
    }

    //Approach 2: Using two pointers to calculate the water trapped
    public int trap2(int[] height) {
        int leftMax =0 , rightMax=0 , left = 0 , right = height.length-1;
        int water =0;
        while(left<right){
            if(height[left]<=height[right]){
                if(leftMax<height[left]){
                    leftMax = height[left];
                }else{
                    water += (leftMax - height[left]);
                }
                left++;
            }else{
                if(rightMax<height[right]){
                    rightMax = height[right];
                }else{
                    water += (rightMax - height[right]);
                }

                right--;
            }
        }

        return water ;
    }
}
