package BinarySearch;

//In duplicates we can skip as many duplicates as we have 
public class SearchInRotatedSortedArrayForDuplicateValue {
	
	public static void main(String[] args) {
		
		int[] nums = { 2, 2, 7, 8, 9, 10, 11, 2 };
		int target = 8;
		System.out.println(firstPivitThanBinarySearchDuplicateValue(nums, target)); 
	}
	
	public static int firstPivitThanBinarySearchDuplicateValue(int[] nums, int target) {

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
			}
			//If elements at middle, start, end are equal than skip the duplicates
			if(nums[mid]==nums[start] && nums[mid]==nums[end]) {
				//skip the duplicates
				//Note: If start and end will be pivot than what happened
				//If start will be pivot
				if(nums[start]>nums[start+1]) {
					return start;
				}
				start++;
				//If end will be pivot
				if(nums[end]<nums[end-1]) {
					return end-1;
				}
				end--;
			}else //left side is sorted, so pivot should be in right
			if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]) {
				start=mid+1;
			}else {
				end=mid-1;
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
