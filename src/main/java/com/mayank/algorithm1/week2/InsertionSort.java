package com.mayank.algorithm1.week2;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {

        Integer arr[] = {7,10,5,3,8,4,2,9,6};
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

    public static  <T extends Comparable<? super T>> void sort(Comparable[] arr){

        for(int i=0; i< arr.length ;i++){

            for(int j = i; j > 0;j--){
                if(less(arr[j], arr[j-1])){
                    swap(arr,j,j-1);
                }
            }


        }
    }


    public static  <T extends Comparable<? super T>> void sort(List<T> list){

        for(int i=0; i< list.size() ;i++){
            for(int j = i; j > 0;j--){
                if(less(list.get(j), list.get(j-1))){
                    swap(list,j,j-1);
                }
            }
        }
    }

    private static <T extends Comparable<? super T>> boolean less(T u, T v) {
        return u.compareTo(v) == -1;
    }

    private static <T extends Comparable<? super T>> void swap(List<T> list, int i, int j) {
        System.out.println("Minimum number is "+list.get(j)+"swapping with number "+list.get(i));
        T temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j, temp);
    }


    private static void swap(Comparable[] arr, int i, int j){
        System.out.println("Minimum number is "+arr[j]+"swapping with number "+arr[i]);
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
