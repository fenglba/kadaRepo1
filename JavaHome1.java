package com.test;

import java.util.Scanner;

/**
 * p1、编程题:编写一个函数，根据参数的不同数字(1~7），返回不同的星期几的字符串(“星期一”~“星期日”)
 * 函数原型:String test(int n)
 * 请使用java语言编写该函数,并在函数中返回结果值。
 */
public class JavaHome1 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("请输入1~7的整数：哈哈哈哈哈哈哈哈哈哈");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = test(n);
        System.out.println(str);

    }

    public static String test(int n){
        String str="";
        switch(n){
            case 1 : str = "星期一";
                break;
            case 2 : str = "星期二";
                break;
            case 3 : str = "星期三";
                break;
            case 4 : str = "星期四";
                break;
            case 5 : str = "星期五";
                break;
            case 6 : str = "星期六";
                break;
            case 7 : str = "星期日";
                break;
        }
        return str;
    }
}
