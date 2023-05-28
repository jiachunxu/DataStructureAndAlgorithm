package org.jsw.algorithm;

import java.util.Arrays;

/**
 * @author adminjia
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] num = {4, 69, 3, 3, 1, 56};

        quickSort(num);

        System.out.println(Arrays.toString(num));

    }

    public static void quickSort(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        quickSort(nums, 0, nums.length - 1);

    }

    private static void quickSort(int[] nums, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int left = startIndex;
        int right = endIndex;
        int pivot = nums[left];
        while (left < right) {
            while (left < right && nums[right] >= pivot) {
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] <= pivot) {
                left++;
            }
            nums[right] = nums[left];


        }
        nums[left] = pivot;
        quickSort(nums, startIndex, left - 1);
        quickSort(nums, left + 1, endIndex);


    }
}
