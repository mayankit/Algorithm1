package com.mayank.algorithm1.week1;

public class BinarySearch {



    public int search(int[] arr, int key,int start, int end){

        while(start <= end){

            int mid = start + (end-start)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] > key){

                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }



}
