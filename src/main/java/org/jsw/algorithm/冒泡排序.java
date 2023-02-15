package org.jsw.algorithm;

import java.util.Arrays;

public class 冒泡排序 {

    public static void main(String[] args) {

        int[] num = {4, 69, 3, 3, 1, 56};

        bubbleSort(num);

        System.out.println(Arrays.toString(num));


    }

    public static void bubbleSort(int[] num) {
        if (num == null) {
            return;
        }
        int len = num.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
}
