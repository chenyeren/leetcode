package com.chen.leetcode;

import java.util.Scanner;

/**
 * @program: leetcode
 * @description: 计算某字符出现次数
 * @author: chenyr
 * @create: 2022-05-03 22:08
 **/
public class HJ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine().toLowerCase();
        String s = sc.nextLine();
        System.out.print(str.length()-str.replaceAll(s,"").length());
    }
}
