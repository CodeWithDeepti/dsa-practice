package com.dsa.app.leetcode.top150.arraystring;

public class LC0189_RotateArray {
    public void rotate(int[] nums, int k) {
        k= k % nums.length ;
        int rotationPoint = nums.length - k;
        reverse(0,rotationPoint-1,nums);
        reverse(rotationPoint,nums.length-1,nums);
        reverse(0,nums.length-1,nums);
    }

    void reverse(int left, int right , int[] nums){
        int temp;
        while(left< right){
            temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
