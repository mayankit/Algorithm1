package com.mayank.algorithm1.week2;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {

        Integer[] arr = {7, 10, 5, 3, 8, 4, 2, 9, 6};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);

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
        selectionSort.sort(list);
    }

    public <T extends Comparable<? super T>> void sort(Comparable[] arr) {

        for(int i=0; i< arr.length ;i++){

            int min = i;

            for(int j = i+1; j< arr.length;j++){
                if (SortingHelper.less(arr[j], arr[min])) {
                    min = j;
                }
            }

            SortingHelper.swap(arr, i, min);
        }
    }


    public <T extends Comparable<? super T>> void sort(List<T> list) {

        for(int i=0; i< list.size() ;i++){

            int min = i;

            for(int j = i+1; j< list.size();j++){
                if (SortingHelper.less(list.get(j), list.get(min))) {
                    min = j;
                }
            }

            SortingHelper.swap(list, i, min);
        }
    }

}
