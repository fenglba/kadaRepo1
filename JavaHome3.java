package com.test;

import java.util.Scanner;

/**
 * p3、 编程题: 已知有三个整数，编写函数求它们中的最大值
 */
public class JavaHome3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = test(a, b, c);
        System.out.println("最大的值是:"+max);

    }


    public static int test(int a, int b, int c) {
        int max=0;
        if (b > a) {
            max = b;
            if (c > b)
                max = c;
        }
        else if (c > a) {
            max = c;
            if (b>c){
                max=b;
            }
        }else if(a>b){
            max=a;
            if (c>a){
                max=c;
            }
        }

        return max;
    }
}
