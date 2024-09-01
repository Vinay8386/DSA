package Array;

import java.util.Arrays;

public class ArrayToStringConversion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //conversion of an array to String without removing any delimeter
        System.out.println("Value of String str : " + Arrays.toString(array));
        //conversion of an array to String and remove all the delimeter
        System.out.println("Array as String: " + arrayToString(array));
    }
    //Method to convert an array to String
    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num);
        }
        return sb.toString();
    }
}
