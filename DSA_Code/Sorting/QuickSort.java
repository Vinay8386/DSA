package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={9,4,3,6,7,8};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {

        if(low>=high) return;;
        int s=low;
        int e=high;
        int pivot=arr[s+(e-s)/2];

        while (s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        //Now pivot is at correct index so sort two halves
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }

    private static void swap(int[] arr, int s, int e) {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}

/*
Sol:
s-1) find pivot
s-2) put pivot is at correct position
s-30 sort both halves
*/
