package BinarySearch;

public class RotatonCountInRotatedSortedArray {
	public static void main(String[] args) {
		int[] nums = { 5, 6, 7, 8, 9, 10, 11, 1 };
		System.out.println(rotationCount(nums)); 
	}
	
	public static int rotationCount(int[] nums) {

		int pivit = rotatedSortedArray(nums);
		return pivit+1;
	}

	public static int rotatedSortedArray(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid<end && nums[mid] > nums[mid + 1]) {
				return mid;
			} else if (mid>start && nums[mid] < nums[mid - 1]){
				return mid - 1;
			}else if(nums[mid]<=nums[start]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
}
