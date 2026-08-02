package com.dsa.app.leetcode.top150.arraystring;

import java.util.Arrays;
import java.util.Scanner;

public class LC0055_JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = nums[0];
        for(int i=0 ; i< nums.length && i <=maxReach; i++){
            if(nums[i]+i >= maxReach){
                maxReach = nums[i]+i;
                if(maxReach>=nums.length-1){
                    return true;
                }
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LC0055_JumpGame program = new LC0055_JumpGame();

        // 1. Get sizes of active elements
        System.out.print("Enter number of elements in nums (m): ");
        int m = scanner.nextInt();

        // 2. Initialize arrays (nums1 must have a size of m + n)
        int[] nums = new int[m];

        // 3. Read elements for nums1
        if (m > 0) {
            System.out.println("Enter " + m + " elements for nums:");
            for (int i = 0; i < m; i++) {
                nums[i] = scanner.nextInt();
            }
        }


        // 5. Execute the merge
        boolean canReach = program.canJump(nums);

        System.out.println("\nCan Reach: " + canReach);

        scanner.close();
    }
}
