package com.ruanshengwei.leetcode.JudgeSquareSum;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {


    }

    public static Boolean solution(int c){
        int counts = (int)Math.sqrt(c);

        int begin = 0;
        int end = counts;

        while (begin<end){

            if ((begin*begin+end*end) == c){
                return true;
            }else {
                if ((begin*begin+end*end)<c){
                    begin++;
                }else {
                    end--;
                }
            }
        }
        return false;
    }

}
