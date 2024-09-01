package Array;

//Write a program that calculates the sum of all the elements in an integer array.
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sumArray(arr));
    }

    private static int sumArray(int[] arr) {
        int sum=0;
        for (int a:arr) {
            sum+=a;
        }
        return sum;
    }
}
