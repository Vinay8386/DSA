package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicate {
	public static void main(String[] args) {
		int[] arr = {1,1,2};
		findDuplicate(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(findDuplicate(arr));
	}
	public static List<Integer> findDuplicate(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(correctIndex<nums.length && nums[i]!=nums[correctIndex]) {
				swap(nums,i,correctIndex);
			}else {
				i++;
			}
		}
		List<Integer> list=new ArrayList<>();
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]!=j+1) {
				list.add(nums[j]);
			}
		}
		return list;
	}
	public static void swap(int[] arr, int startIndex, int correctIndex) {
		int temp=arr[startIndex];
		arr[startIndex]=arr[correctIndex];
		arr[correctIndex]=temp;
	}
}
