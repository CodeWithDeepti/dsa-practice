package com.dsa.app.leetcode.top150.arraystring;

import java.util.Arrays;
import java.util.Scanner;

public class LC0169_MajorityElement {
    public int majorityElement(int[] nums) {
        int majEle = nums[0] ;
        int majEleCount =1;

        for(int i=1 ; i< nums.length ; i++){
            if(nums[i]==majEle){
                majEleCount++;
            }else{
                if(majEleCount==0){
                    majEle=nums[i];
                    majEleCount++;
                }else{
                    majEleCount--;
                }
            }
        }

        return majEle;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LC0169_MajorityElement program = new LC0169_MajorityElement();

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
        int majorityElement = program.majorityElement(nums);

        // 6. Print the result
        System.out.println("\nMajority Element is " + majorityElement);

        scanner.close();
    }
}
