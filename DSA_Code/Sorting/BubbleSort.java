package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,2,9,14,0};
        sortAlgo(arr);
        int[] arr1={5,10,15,20,25};
        sortAlgoOptimize(arr1);
    }

    //time complexity=O(n^2) & space complexity=O(1)
    private static void sortAlgo(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //optimize solution : Increase swap variable, If array will be sorted than there will be no swapping
    //time complexity=O(n) & space complexity=O(1)
    private static void sortAlgoOptimize(int[] arr) {
        for (int i=0;i<arr.length;i++){
            boolean swap=false;
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Best case time complexity =O(n)
//worst case time complexity=O(n^2)
//space complexity=O(1)
