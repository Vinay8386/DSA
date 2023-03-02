package BinarySearch;

public class FloorElement {
	//greatest element of array which is smaller than and equal to target element 
	
	public static void main(String[] args) {
		
		int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
		int target = 1;
		floorOfANumber(arr, target);
		System.out.println(
				"floor element is : " + "arr[" + floorOfANumber(arr, target) + "]=" + arr[floorOfANumber(arr, target)]);
		System.out.println("floor of target element is : " + arr[floorOfANumber(arr, target)]);
	}

	private static int floorOfANumber(int[] arr, int target) {
		 
		
		int start = 0;
		int end = arr.length - 1;
		
		if (target < arr[start])
		{ 
			System.out.println("target element : " +target+ " is smaller than start element : " +arr[start]+", so Floor not exist");
			return -1; 
		}else {
			while (start <= end) // element exist
			{
				int mid = start + (end - start) / 2;

				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					start = mid + 1;
				} else {
					return mid;
				}
			}
			return end;
		}
	}

}
