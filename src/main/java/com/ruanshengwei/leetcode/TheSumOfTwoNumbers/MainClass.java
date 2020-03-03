package com.ruanshengwei.leetcode.TheSumOfTwoNumbers;

public class MainClass {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0]=0;
        numbers[1]=4;
        numbers[2]=3;
        numbers[3]=0;

        int[] result = Solution.twoSum(numbers,0);
        System.out.println(result[0]+" "+result[1]);
    }
}
