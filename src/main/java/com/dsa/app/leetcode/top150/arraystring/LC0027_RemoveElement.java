package com.dsa.app.leetcode.top150.arraystring;

import java.util.Arrays;
import java.util.Scanner;

public class LC0027_RemoveElement {

    public int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        // move from right to left. If a val occurs swap it to the rightmost non val element.
        for(int i = nums.length-1 ; i>=0 ; i--){
            if(nums[i]==val){
                nums[i]=nums[j];
                nums[j]=val;
                j--;
            }
        }
        return j+1 ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LC0027_RemoveElement program = new LC0027_RemoveElement();

        // 1. Get sizes of active elements
        System.out.print("Enter number of elements in nums (m): ");
        int m = scanner.nextInt();

        // 2. Initialize arrays (nums1 must have a size of m + n)
        int[] nums = new int[m];

        // 3. Read elements for nums1
        if (m > 0) {
            System.out.println("Enter " + m + " sorted elements for nums:");
            for (int i = 0; i < m; i++) {
                nums[i] = scanner.nextInt();
            }
        }

        System.out.print("Enter value that you want to remove");
        int val = scanner.nextInt();

        // 5. Execute the merge
        int numberOfRemainingElements = program.removeElement(nums, val);

        // 6. Print the result
        System.out.println("\nMerged Array (nums1): " + Arrays.toString(nums));

        System.out.println("\nnumberOfRemainingElements: " + numberOfRemainingElements);

        scanner.close();
    }
}
