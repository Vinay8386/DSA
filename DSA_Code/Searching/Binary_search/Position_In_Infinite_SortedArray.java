package BinarySearch;

//Find position of element in sorted array of infinite number
//Here we have infinite element so we don't know end ,
//so we can take fix element and search in that than again double that and search, again double and search .......
//for ex- taken 5 element & search than 2*5=10 element than search than 2*10=20......till getting target
public class Position_In_Infinite_SortedArray {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 15, 16, 17, 18, 19,21,23 };
		int target = 14;
		sortPosition(arr, target);
		System.out.println(sortPosition(arr, target));
	}

	private static int sortPosition(int[] arr, int target) {

		// First find the range and start with a box of size 2
		int start = 0;
		int end = 1;

		// Condition for the target to lie in the range
		while (target > arr[end]) {

			int temp = end + 1; // this is my new start
			end = end + (end - (start - 1)) * 2; // end=previous end + size of box*2 //double the box length
			start = temp;
		}
		return binarySearch(arr, target, start, end);

	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		
		while (start <= end) {

			int mid = start + (end - start) / 2;
			
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
