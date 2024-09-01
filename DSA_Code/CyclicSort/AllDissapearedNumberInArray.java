package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDissapearedNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 4,3,2,7,8,2,3,1 };
		findDisappearedNumbers(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(findDisappearedNumbers(arr));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int i=0;
		while(i<nums.length) {
			int correctIndex=nums[i]-1;
			if(correctIndex<nums.length && nums[i]!=nums[correctIndex]) {
				swap(nums,i,correctIndex);
			}else {
				i++;
			}
		}
		//
		List<Integer> list=new ArrayList<>();
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]!=j+1) {
				 list.add(j+1);
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
