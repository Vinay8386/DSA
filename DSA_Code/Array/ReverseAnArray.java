package Array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
        for (int val:array) {
            System.out.print(val+" ");
        }
        reverseUsingPredefinedMethod(array);
    }

    //By Swapping with two pointers
    //In-place reversal
    private static int[] reverse(int[] array) {
        int i=0;
        int j=array.length-1;
        while (i<=j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return array;
    }

    public static void reverseUsingPredefinedMethod(int[] array) {

        //Reverse the element
        Collections.reverse(Arrays.asList(array)); //return list

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(array));  //This is a String representation of an array object
    }
}
