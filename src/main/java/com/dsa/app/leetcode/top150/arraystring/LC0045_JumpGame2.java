package com.dsa.app.leetcode.top150.arraystring;

import java.util.Arrays;
import java.util.Scanner;

public class LC0045_JumpGame2 {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int currentIndex =0;
        int range = nums[currentIndex]+currentIndex; ;
        int count = 1;
        int currIndexReached =0;
        int maxReachInRange = range;
        while(range < nums.length-1){
            for(int i= currentIndex+1 ; i<= range ; i++){
                currIndexReached = nums[i]+i ;
                if(maxReachInRange<  currIndexReached){
                    maxReachInRange = currIndexReached;
                }
            }
            range = maxReachInRange ;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LC0045_JumpGame2 program = new LC0045_JumpGame2();

        // 1. Get sizes of active elements
        System.out.print("Enter number of elements in nums (m): ");
        int m = scanner.nextInt();

        // 2. Initialize arrays (nums1 must have a size of m + n)
        int[] nums = new int[m];

        // 3. Read elements for nums
        if (m > 0) {
            System.out.println("Enter " + m + " sorted elements for nums:");
            for (int i = 0; i < m; i++) {
                nums[i] = scanner.nextInt();
            }
        }

        // 4. Execute the merge
        int numberOfJumps = program.jump(nums);

        System.out.println("\nnumber Of Jumps Required: " + numberOfJumps);

        scanner.close();
    }
}
