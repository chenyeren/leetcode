package com.chen.leetcode;

/**
 * @program: leetcode
 * @description: 确定两串乱序同构
 * @author: chenyr
 * @create: 2022-05-02 21:31
 *
 * 给定string stringA和string stringB，编写程序确认两字符串包含的字符是否完全相同，注意大小写为不同字符，
 * 且考虑字符串中的空格，返回一个bool，代表两串是否由一样的字符组成。保证两串的长度都小于等于5000。
 **/
public class Same {
    public static boolean checkSam(String stringA, String stringB) {
        if (stringA.length() != stringB.length()) {
            return false;
        }

        if (stringA.equals(stringB)) {
            return true;
        }

        int inta = 0;
        for (int i = 0; i < stringA.length(); i++) {
            if (stringB.indexOf(stringA.charAt(i)) < 0) {
                return false;
            }

            inta += stringA.codePointAt(i);
        }

        int intb = 0;
        for (int i = 0; i < stringB.length(); i++) {
            intb += stringB.codePointAt(i);
        }

        if (inta == intb) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Same.checkSam("This is nowcoder", "is This nowcoder"));
        System.out.println(Same.checkSam("Here you are", "Are you here"));
    }
}
