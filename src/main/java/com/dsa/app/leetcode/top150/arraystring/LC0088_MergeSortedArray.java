package com.dsa.app.leetcode.top150.arraystring;

import java.util.Arrays;
import java.util.Scanner;

public class LC0088_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k = m+n-1 ;
        while( i>=0  && j >=0 ){
            if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k-- ;
        }

        while( j>=0 ){
            nums1[k]=nums2[j];
            k--  ;
            j-- ;
        }
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            LC0088_MergeSortedArray program = new LC0088_MergeSortedArray();

            // 1. Get sizes of active elements
            System.out.print("Enter number of active elements in nums1 (m): ");
            int m = scanner.nextInt();

            System.out.print("Enter number of elements in nums2 (n): ");
            int n = scanner.nextInt();

            // 2. Initialize arrays (nums1 must have a size of m + n)
            int[] nums1 = new int[m + n];
            int[] nums2 = new int[n];

            // 3. Read elements for nums1
            if (m > 0) {
                System.out.println("Enter " + m + " sorted elements for nums1:");
                for (int i = 0; i < m; i++) {
                    nums1[i] = scanner.nextInt();
                }
            }

            // 4. Read elements for nums2
            if (n > 0) {
                System.out.println("Enter " + n + " sorted elements for nums2:");
                for (int j = 0; j < n; j++) {
                    nums2[j] = scanner.nextInt();
                }
            }

            // 5. Execute the merge
            program.merge(nums1, m, nums2, n);

            // 6. Print the result
            System.out.println("\nMerged Array (nums1): " + Arrays.toString(nums1));

            scanner.close();
        }
    }
