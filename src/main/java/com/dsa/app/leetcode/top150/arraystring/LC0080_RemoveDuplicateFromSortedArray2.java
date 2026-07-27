package com.dsa.app.leetcode.top150.arraystring;

import java.util.Arrays;
import java.util.Scanner;

// Leetcode : Remove duplicate from sorted Array 2
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
public class LC0080_RemoveDuplicateFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int count= 0 ;
        int j=0 ;
        int prevElement = nums[0];
        int currentElement ;
        for(int i=0; i < nums.length ; i++){
            currentElement = nums[i];
            if(prevElement==currentElement){
                if(count<2){
                    nums[j++]=nums[i];
                }
                count++;
            }else{
                nums[j++]=nums[i];
                count=1;
                prevElement=currentElement;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LC0080_RemoveDuplicateFromSortedArray2 program = new LC0080_RemoveDuplicateFromSortedArray2();

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

        // 5. Execute the merge
        int numberOfRemainingElements = program.removeDuplicates(nums);

        // 6. Print the result
        System.out.println("\nMerged Array (nums1): " + Arrays.toString(nums));

        System.out.println("\nnumberOfRemainingElements: " + numberOfRemainingElements);

        scanner.close();
    }
}
