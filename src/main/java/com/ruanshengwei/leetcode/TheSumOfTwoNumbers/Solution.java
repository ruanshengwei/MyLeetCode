package com.ruanshengwei.leetcode.TheSumOfTwoNumbers;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[4096];
        for (int i = 0; i < nums.length; i++)
        {
            int c = (target - nums[i])%2048;

            if (c<0){
                c= 2048+c;
            }

            if (result[c] != 0)
            {
                return new int[] { result[c]-1, i };
            }

            if (nums[i]<0){
                nums[i] = nums[i]+2048;
            }

            result[nums[i]%2048] = i + 1;
        }
        return null;

//        int volume = 4096; // 100000000000
//        int bitMode = 4096-1;//011111111111
//        int[] result = new int[volume];
//        for (int i = 0; i < nums.length; i++)
//        {
//            int c = (target - nums[i])&bitMode;
//            if (result[c] != 0)
//            {
//                return new int[] { result[c] - 1, i };
//            }
//            result[nums[i]&bitMode] = i + 1;
//        }
//        return null;

    }
}
