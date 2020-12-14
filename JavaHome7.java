package com.test;

/**
 * 计算二维数组第0行的最大值
 */
public class JavaHome7 {
    public static void main(String[] args) {
        long a[][] = new long[3][];
        a[0] = new long[]{3, 5, 7,4};
        a[1] = new long[]{3, 2, 3,5};
        a[2] = new long[]{3, 1, 3,6};
//        a[3] = new long[]{3, 1, 3,6};

        long test = test(a);
        System.out.println(test);
    }

    public static long test(long[][] data) {
        long max = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (max < data[0][j]) {
                    max = data[0][j];
                }
            }

        }
        return max;
    }

}

