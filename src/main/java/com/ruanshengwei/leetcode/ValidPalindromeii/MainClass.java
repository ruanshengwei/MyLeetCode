package com.ruanshengwei.leetcode.ValidPalindromeii;

public class MainClass {

    public static void main(String[] args) {

        System.out.println(validPalindrome("abca"));

    }

    public static boolean validPalindrome(String s) {
        int begin = 0;
        int end  = s.length() - 1;
        return validChar(s,begin,end);

    }

    public static boolean validChar(String s,int begin,int end){
        while (begin<end){
            if (s.charAt(begin)!=s.charAt(end)){
                if (validChar2(s,begin+1,end)||validChar2(s,begin,end-1)){
                    return true;
                }else {
                    return false;
                }
            }{
                begin++;
                end--;
            }
        }
        return true;
    }

    public static boolean validChar2(String s,int begin,int end){

        while (begin<end){
            if (s.charAt(begin)!=s.charAt(end)){
                    return false;
            }{
                begin++;
                end--;
            }
        }

        return true;

    }
}
