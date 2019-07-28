package com.mayank.algorithm1.week2;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {

        Integer[] arr = {7, 10, 5, 3, 8, 4, 2, 9, 6};
        InsertionSort insertionSort = new InsertionSort();
        //insertionSort.sort(arr);

        List<Integer> list = new ArrayList<Integer>(){
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
        insertionSort.sort(list);
    }

    public <T extends Comparable<? super T>> void sort(Comparable[] arr) {

        for(int i=0; i< arr.length ;i++){

            for(int j = i; j > 0;j--){
                if (SortingHelper.less(arr[j], arr[j - 1])) {
                    SortingHelper.swap(arr, j, j - 1);
                }
            }


        }
    }


    public <T extends Comparable<? super T>> void sort(List<T> list) {

        for(int i=0; i< list.size() ;i++){
            for(int j = i; j > 0;j--){
                if (SortingHelper.less(list.get(j), list.get(j - 1))) {
                    SortingHelper.swap(list, j, j - 1);
                }
            }
        }
    }

}
