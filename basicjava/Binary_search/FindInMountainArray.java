package BinarySearch;

//find index of target element in mountain array and return first index. if element not found than return -1
//we can follow three step
//1.find peak element of mountain array
//2.find target element in left side of peak element
//3.find target element in right side of peak element
public class FindInMountainArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 6, 4, 3, 2 };
		int target = 3;
		findInMountainArray(arr, target);
		System.out.println(findInMountainArray(arr, target));
	}

	public static int findInMountainArray(int[] arr, int target) {
		int peak = elementInMountainArray(arr, target);
		int firstHalf = binarySearchForAsc(arr, target, 0, peak);
		if (firstHalf != -1) {
			return firstHalf;
		} else {
			return binarySearchForAsc(arr, target, peak + 1, arr.length - 1);
		}
	}

	public static int elementInMountainArray(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	public static int binarySearchForAsc(int[] arr, int target, int start, int end) {

		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}
			if (isAsc) { // if element of array is in ascending order
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			} else { // if element of array is in descending order
				if (target < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}

			}
		}
		return -1;
	}

}
