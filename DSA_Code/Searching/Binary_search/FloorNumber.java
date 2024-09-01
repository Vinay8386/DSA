package Searching.BinarySearch;

//Find the Greatest number in array, which is smaller than or equal to a target element
public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 15;
        System.out.println(floorOfANumber(arr, target));
    }

    private static int floorOfANumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start]) return -1; //element not exist
        while (start <= end) // element exist
        {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
