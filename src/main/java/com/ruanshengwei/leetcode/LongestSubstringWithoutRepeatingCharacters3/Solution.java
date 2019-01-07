package com.ruanshengwei.leetcode.LongestSubstringWithoutRepeatingCharacters3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {

//        int max = 0;
//        String tempString = "";
//        for (int i=0;i<s.length();i++){
//            String temp = s.substring(i,i+1);
//            Boolean contains= tempString.contains(temp);
//            if (contains){
//                max = (max>tempString.length())?max:tempString.length();
//                int index = tempString.indexOf(temp);
//                tempString = tempString.substring(index+1,tempString.length())+temp;
//            }else {
//                tempString=tempString+temp;
//
//            }
//        }
//
//
//        return tempString.length()>max?tempString.length():max;
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        String s="sss";

        int x = lengthOfLongestSubstring("abcbd");

        System.out.println(x);
    }

    public static int lengthOfLongestSubstring2(String s) {
        int[] dict = new int[128];
        int res = 0, l = 0, r = 1;
        for(char c : s.toCharArray()) {
            l = Math.max(l, dict[c]);
            dict[c] = r;
            res = Math.max(res, r++ - l);
        }
        return res;
    }
}
