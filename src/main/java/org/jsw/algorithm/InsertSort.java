package org.jsw.algorithm;

import java.util.Arrays;

/**
 * @author adminjia
 */
public class InsertSort {

    public static void main(String[] args) {

//        int[] num = {4, 69, 3, 3, 1, 56};
        int[] num = {};

        insertSort(num);

        System.out.println(Arrays.toString(num));


    }

    public static void insertSort(int[] num) {
        if (num == null || num.length == 0 || num.length == 1) {
            return;
        }
        int len = num.length;

        int current;
        for (int i = 1; i <= len - 1; i++) {
            current = num[i];
            for (int j = i - 1; j >= 0; j--) {

                if (num[j] > current) {
                    num[j + 1] = num[j];
                    num[j] = current;
                }

            }
        }

    }
}
