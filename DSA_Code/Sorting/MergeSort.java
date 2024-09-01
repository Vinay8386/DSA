package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={9,4,3,6,7,8};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {

        if(arr.length==1) return arr;

        int m=arr.length/2;

        int[] firstArray=mergeSort(Arrays.copyOfRange(arr,0,m));

        int[] secondArray=mergeSort(Arrays.copyOfRange(arr,m,arr.length));

        return mergeUsingTwoPointer(firstArray,secondArray);
    }

    private static int[] mergeUsingTwoPointer(int[] firstArray, int[] secondArray) {

        int[] mergedArray=new int[firstArray.length+secondArray.length];

        int i=0; //pointer for firstArray
        int j=0; //pointer for secondArray
        int k=0; //pointer for a new array where we will put a sorted array

        while (i<firstArray.length && j<secondArray.length){
            if(firstArray[i]<secondArray[j]){
                mergedArray[k]=firstArray[i];
                i++;
            }else {
                mergedArray[k]=secondArray[j];
                j++;
            }
            k++;
        }

        while (i<firstArray.length){
            mergedArray[k]=firstArray[i];
            i++;
            k++;
        }

        while (j<secondArray.length){
            mergedArray[k]=secondArray[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
