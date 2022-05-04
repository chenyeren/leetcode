package com.chen.leetcode;

/**
 * @program: leetcode
 * @description: 字符串最后一个单词的长度
 * @author: chenyr
 * @create: 2022-05-03 21:53
 *
 * 描述
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
 * 输入描述：
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 *
 * 输出描述：
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 **/
public class HJ1 {
    public static int lastWordLenght(String iniString) {
        String[] s = iniString.split(" ");
        return s[s.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(HJ1.lastWordLenght("hello nowcoder"));
    }
}
