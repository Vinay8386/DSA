package Array;

//Create a program that finds the maximum value in an array of integers.
public class MaxumumValueInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }
}
