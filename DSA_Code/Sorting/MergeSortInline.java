package Sorting;

import java.util.Arrays;

public class MergeSortInline {
    public static void main(String[] args) {
        int[] arr={9,4,3,6,7,8};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr,int s, int e) {

        if(e-s==1) return;

        int m=(s+e)/2;

        mergeSort(arr,s,m);

        mergeSort(arr,m,e);

        mergeUsingTwoPointer(arr,s,m,e);
    }

    private static void mergeUsingTwoPointer(int[] arr,int s, int m, int e) {

        int[] mergedArray=new int[e-s];

        int i=s; //pointer from start index to mid-index
        int j=m; //pointer from mid-index to last-index
        int k=0; //pointer for a new array where we will put a sorted array

        while (i<m && j<e){
            if(arr[i]<arr[j]){
                mergedArray[k]=arr[i];
                i++;
            }else {
                mergedArray[k]=arr[j];
                j++;
            }
            k++;
        }

        while (i<m){
            mergedArray[k]=arr[i];
            i++;
            k++;
        }

        while (j<e){
            mergedArray[k]=arr[j];
            j++;
            k++;
        }
        for (int l=0;l<mergedArray.length;l++){
            arr[s+l]=mergedArray[l];
        }
    }
}
