package org.jsw.algorithm;

import java.util.Arrays;

/**
 * @author adminjia
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] num = {4, 69, 3, 3, 1, 56};

        selectSort(num);

        System.out.println(Arrays.toString(num));


    }

    public static void selectSort(int[] num) {
        if (num == null) {
            return;
        }
        int len = num.length;
        int temp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

    }
}
