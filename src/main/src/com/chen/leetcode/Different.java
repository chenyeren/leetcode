package com.chen.leetcode;

/**
 * @program: leetcode
 * @description: 确定字符互异
 * @author: chenyr
 * @create: 2022-05-02 20:58
 *
 * 给定一个字符串string iniString，请返回一个bool值,True代表字符串的所有字符全都不同，False代表存在相同的字符。
 * 保证字符串中的字符为ASCII字符且不允许使用额外的存储结构，字符串的长度小于等于3000。大小写字母算不同的字符
 *
 * 通过全部用例
 * 运行时间
 * 25ms
 * 占用内存
 * 9988KB
 **/
public class Different {
    public static boolean checkDifferent(String iniString) {

        for (int i = 0; i < iniString.length(); i++) {
            for (int j = i+1; j < iniString.length(); j++) {
                if (iniString.charAt(j) == iniString.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Different.checkDifferent("aeiou"));
        System.out.println(Different.checkDifferent("BarackObama"));

    }
}
