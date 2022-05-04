package com.chen.leetcode;

/**
 * @program: leetcode
 * @description: 空格替换
 * @author: chenyr
 * @create: 2022-05-02 22:17
 *
 * 给定一个string iniString 及其长度 int len, 已知该字符串中有空格，现要求编写程序将字符串中空格替换为“%20”。返回更改后的string。
 * 假设该字符串有足够的空间存放新增的字符，并且知道原字符的长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
 **/
public class Replacement {
    public static String replaceSpace(String iniString, int length) {
        String ret = "";
        for (int i = 0; i < length; i++) {
            if (' ' == iniString.charAt(i)) {
                ret += "%20";
            } else {
                ret += iniString.charAt(i);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(Replacement.replaceSpace("Mr John Smith", 13));
        System.out.println(Replacement.replaceSpace("Hello  World", 12));
    }
}
