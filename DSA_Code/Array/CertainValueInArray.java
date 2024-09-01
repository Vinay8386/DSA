package Array;

//Write a method that checks whether a certain integer value is present in an array.
public class CertainValueInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int valueToCheck = 3;
        System.out.println(checkValue(array,valueToCheck));
    }

    private static boolean checkValue(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
