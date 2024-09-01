package BinarySearch;

public class MountainArrayOrBitonicArrayApproach2 {

	public static void main(String[] args) {

		//int[] arr = { 18, 29, 38, 59, 98, 100, 99, 98, 90 };
		int[] arr = { 5,6,4,3,2};
		mountainArray2(arr);
		System.out.println(mountainArray2(arr));
		System.out.println("peak element of mountain array : " + arr[mountainArray2(arr)]);
	}

	private static int mountainArray2(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (start != mid) {
				if (arr[mid] > arr[mid - 1]) {
					start = mid;
				} else {
					end = mid - 1;
				}

			} else {
				if (arr[mid] > arr[mid + 1]) {
					end = mid;
				} else {
					start = mid + 1;
				}
			}
		}

		return start;
	}

}
