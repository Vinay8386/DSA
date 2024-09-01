package Array;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr1={3,4,9}; //first sorted array
        int[] arr2={4,6,8}; //second sorted array

        System.out.println(Arrays.toString(mergeUsingTwoPointer(arr1, arr2)));
    }
    private static int[] mergeUsingTwoPointer(int[] arr1, int[] arr2) {

        int i=0; //pointer for first array
        int j=0; //pointer for second array
        int k=0; //pointer for new array where we will store our value

        //create new empty array where we will store our value after comparison
        int[] mergedArray=new int[arr1.length+arr2.length];

        //start comparison of both array
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergedArray[k]=arr1[i];
                i++;
            }else {
                mergedArray[k]=arr2[j];
                j++;
            }
            k++;
        }

        //If both array is of different size than some element of larger size will remain at end
        //so put remaining element of larger size array at the end

        //If arr1 size is larger than arr2
        while (i<arr1.length){
            mergedArray[k]=arr1[i];
            i++;
            k++;
        }

        //If arr2 size is larger than arr1
        while (j<arr2.length){
            mergedArray[k]=arr2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
