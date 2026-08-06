package com.dsa.app.leetcode.top150.arraystring;

public class LC0238_ProductOfArrayExceptSelf {

    // Approach 1 : Using Division
    public int[] productExceptSelf(int[] nums) {
        int[] answers = new int[nums.length];
        long product= 1;
        int numberOfZeros =0;
        for(int val : nums){
            if(val==0){
                numberOfZeros++;
                if(numberOfZeros==2){
                    return answers ;
                }
            }else{
                product *=val;
            }
        }

        if(numberOfZeros==0){
            for(int i=0 ; i< nums.length ; i++){
                answers[i] = (int)product / nums[i];
            }
        }else{
            for(int i=0 ; i< nums.length ; i++){
                if(nums[i]!=0){
                    answers[i]=0;
                }else{
                    answers[i] = (int)product ;
                }
            }
        }

        return answers;
    }

    // Approach 2 : Without using Division
    public int[] productExceptSelf2(int[] nums) {
        int[] answers = new int[nums.length];

        answers[0]=1;
        int len = nums.length ;

        // store prefix in each element
        for(int i=1; i< len ; i++){
            answers[i]= answers[i-1]* nums[i-1];
        }

        // calculate suffix of each element and multiply with the previously calculated prefix
        int suffix =1 ;
        for(int i= len-2 ; i>=0 ; i--){
            suffix *= nums[i+1];
            answers[i] = answers[i] * suffix;
        }

        return answers;
    }
}
