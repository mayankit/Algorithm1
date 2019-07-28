package com.mayank.algorithm1.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * This is also called as h-sort. I am using 3x+1 based h sort algorithm in this
 */
public class ShellSort {

    public static void main(String[] args) {

        Integer[] arr = {7, 10, 5, 3, 8, 4, 2, 9, 6};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(arr);

        List<Integer> list = new ArrayList<Integer>() {
            {
                add(7);
                add(10);
                add(5);
                add(3);
                add(8);
                add(4);
                add(2);
                add(9);
                add(6);
            }
        };
        shellSort.sort(list);
    }

    public <T extends Comparable<? super T>> void sort(Comparable[] arr) {

        int arrSize = arr.length;
        int h = 1;

        while (h < arrSize / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {

            for (int i = h; i > arrSize; i++) {
                for (int j = i; j >= h && SortingHelper.less(arr[j], arr[j - h]); j = j - h) {
                    SortingHelper.swap(arr, j, j - h);
                }
            }
            h = h / 3;
        }
    }


    public <T extends Comparable<? super T>> void sort(List<T> list) {

        int arrSize = list.size();
        int h = 1;

        while (h < arrSize / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {

            for (int i = h; i > arrSize; i++) {
                for (int j = i; j >= h && SortingHelper.less(list.get(j), list.get(j)); j = j - h) {
                    SortingHelper.swap(list, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
