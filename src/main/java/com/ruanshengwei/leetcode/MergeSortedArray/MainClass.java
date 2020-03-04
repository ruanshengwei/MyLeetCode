package com.ruanshengwei.leetcode.MergeSortedArray;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 */
public class MainClass {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3)));
    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n){

        int num1=0;
        int num2=0;

        for (int i=0;i<n;i++){
            int one = nums1[num1];
            int two = nums2[num2];
            if (one<two){
                for (int j=(m-num1-1);j>=(num1+1);j--){
                    nums1[j+1]=nums1[j];
                }
                nums1[num1+1] = nums2[num2];
                num1=num1+2;
                num2++;
            }else {
                for (int j=(m-num1-1);j>=(num1);j--){
                    nums1[j+1]=nums1[j];
                }
                nums1[num1] = nums2[num2];
                num2++;
                num1=num1+1;
            }
        }

        return nums1;

    }



}
