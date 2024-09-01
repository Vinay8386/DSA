package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={14,2,1,6,0};
        sSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sSort(int[] arr, int row, int col, int max) {
        if(row==0) return;

        if(col<row){
            if(arr[max]<arr[col+1]){
                sSort(arr,row,0,col+1);
            }else{
                sSort(arr,row,col+1,max);
            }
        }else{
            swap(arr,max,row);
            sSort(arr,row-1,0,0);
        }
    }

    private static void swap(int[] arr, int max, int row) {
        int temp=arr[row];
        arr[row]=arr[max];
        arr[max]=temp;
    }
}
