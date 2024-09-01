package Sorting;

import java.util.Arrays;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr={5,2,9,14,0};
        rSort(arr,0,0);
    }

    private static void rSort(int[] arr,int row,int col) {
        if(col==arr.length-1) return;
        if(row<=col){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            rSort(arr,0,col+1);
        }else {
            rSort(arr,row-1,0);
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Best case time complexity =O(n)
//worst case time complexity=O(n^2)
//space complexity=O(1)
