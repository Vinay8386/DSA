package BinarySearch;

import java.util.Arrays;

//1.find pivit
//2.apply binary serch in first half as well as second half
public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = { 5, 6, 7, 8, 9, 10, 11, 1 };
		int target = 1;
		System.out.println(firstPivitThanBinarySearch(nums, target)); 
	}

	public static int firstPivitThanBinarySearch(int[] nums, int target) {

		int pivit = rotatedSortedArray(nums, target);
		int result = firstHalfBinarySearch(nums, target, 0, pivit);
		if (result != -1) {
			return result;
		} else {
			return firstHalfBinarySearch(nums, target, pivit + 1, nums.length - 1);
		}
	}

	public static int rotatedSortedArray(int[] nums, int target) {

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

	public static int firstHalfBinarySearch(int[] nums, int target, int start, int end) {

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (nums[mid] < target) {
				start = mid+1;
			} else if (nums[mid] > target){
				end=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
//this will not work in duplicate values
//we will do this also in single method by using recursion
