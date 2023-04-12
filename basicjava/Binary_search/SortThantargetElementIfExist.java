package BinarySearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


//here we take an array with given value  and sort it in ascending order and than check the target element available or not
//if available return index of target element if not available return -1

public class SortThantargetElementIfExist {

	public static void main(String[] args) {

		int[] arr = { 5, 8, 2, 18, 53, 33, 99 };
		sortAscendingWithGivenArray(arr);

	}

	public static void sortAscendingWithGivenArray(int[] arr) {

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int target = 33;
		binarysearch(arr,target);
		System.out.println(binarysearch(arr,target));

	}

	private static int binarysearch(int[] arr, int target) {
		
				int start=0;
				int end=arr.length-1;
				
				while(start<=end)   //element exist
				{
					int mid=start+(end-start)/2;
					
					if(target<arr[mid]) {
						end=mid-1;
					}else if (target>arr[mid]) {
						start=mid+1;
					}else {
						return mid;
					}
				}
				return -1;
	}

}
