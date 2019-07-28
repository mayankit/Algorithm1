package com.mayank.algorithm1.week2;

import java.util.List;

class SortingHelper {

    static <T extends Comparable<? super T>> boolean less(T u, T v) {
        return u.compareTo(v) == -1;
    }

    static <T extends Comparable<? super T>> void swap(List<T> list, int i, int j) {
        System.out.println("Minimum number is " + list.get(j) + "swapping with number " + list.get(i));
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }


    static void swap(Comparable[] arr, int i, int j) {
        System.out.println("Minimum number is " + arr[j] + "swapping with number " + arr[i]);
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
