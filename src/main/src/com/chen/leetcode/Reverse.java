package com.chen.leetcode;

/**
 * @program: leetcode
 * @description: 原串翻转
 * @author: chenyr
 * @create: 2022-05-02 21:10
 *
 * 给定一个string iniString，请返回一个string，为该字符串翻转后的结果。要求不使用额外数据结构和储存空间，可以使用单个过程变量，保证字符串的长度小于等于5000。
 **/
public class Reverse {
    public static String reverseString(String iniString) {

        String ret = "";
        for (int i = iniString.length() - 1; i >= 0 ; i--) {
            ret += iniString.charAt(i);
        }
        
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(Reverse.reverseString("This is nowcoder"));
    }
}
