package com.ruanshengwei.leetcode.ReverseVowelsOfAString;


import java.util.Arrays;
import java.util.HashSet;

public class MainClass {

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {

        int begin =0;
        int end = s.length()-1;

        char[] chas = s.toCharArray();

        while (begin<end){

            if (isYuan(chas[begin])){
                while (!isYuan(chas[end])){
                    end--;
                }
                swap(chas,begin,end);
                begin++;
                end--;
            }else {
                begin++;
            }

        }

        return new String(chas);

    }

    public static void swap(char c[],int a,int b){
        char temp= c[a];
        c[a]=c[b];
        c[b]=temp;
    }

    public static boolean isYuan(char s){
        if(s=='A' || s=='E' || s=='I' || s=='O' || s=='U' || s=='a' || s=='e' || s=='i' || s=='o' ||            s=='u' )
            return true;
        return false;
    }
}
