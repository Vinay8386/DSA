package Sorting;

import java.util.Arrays;

public class BubbleSortRecursive2 {
    public static void main(String[] args) {
        int[] arr={5,2,9,14,0};
        rSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void rSort(int[] arr,int row,int col) {
        if(row==0) return;;

        if(col<row){
            if(arr[col]>arr[col+1]){
                swap(arr,col);
            }
            rSort(arr,row,col+1);
        }
        rSort(arr,row-1,col);
    }

    private static void swap(int[] arr, int col) {
        int temp=arr[col];
        arr[col]=arr[col+1];
        arr[col+1]=temp;
    }
}

//Best case time complexity =O(n)
//worst case time complexity=O(n^2)
//space complexity=O(1)
