package Searching.BinarySearch;

//Find the smallest number in the given array which is greater than or equal to target elements
public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {14, 16, 18};
        System.out.println(search(arr, 11));
    }

    private static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        if (target > arr[arr.length - 1]) return -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                return arr[m];
            }
        }
        return arr[s];
    }
}
