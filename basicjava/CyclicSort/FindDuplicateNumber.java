package CyclicSort;

import java.util.Arrays;
import java.util.List;

public class FindDuplicateNumber {
	public static void main(String[] args) {
		int[] arr = {1,3,4,2,2};
		findDuplicate(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(findDuplicate(arr));
	}
	public static int findDuplicate(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(correctIndex<nums.length && nums[i]!=nums[correctIndex]) {
				swap(nums,i,correctIndex);
			}else {
				i++;
			}
		}
		int ans=0;
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]!=j+1) {
			 ans=nums[j];
			}
		}
		return ans;
	}
	public static void swap(int[] arr, int startIndex, int correctIndex) {
		int temp=arr[startIndex];
		arr[startIndex]=arr[correctIndex];
		arr[correctIndex]=temp;
	}

}
