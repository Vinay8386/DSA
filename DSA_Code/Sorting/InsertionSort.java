package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={14,2,1,6,0};
        iSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void iSort(int[] arr, int n) {

        //Base Case: If array size is 1 or smaller, return.
        if(n<=1) return;

        //Recursively sort first n-1 elements.
        iSort(arr,n-1);

        //Insert last element at its correct position in sorted array.
        int last=arr[n-1];
        int j=n-2;
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
