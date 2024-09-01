package CyclicSort;

import java.util.Arrays;

public class CyclicSortCode {
	public static void main(String[] args) {
		int[] arr = {3,5,2,1,4};
		sortCyclic(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sortCyclic(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=arr[arr[i]-1]) {
				swap(arr,i,arr[i]-1);
			}else {
				i++;
			}
		}
	}
	public static void swap(int[] arr, int startIndex, int correctIndex) {
		int temp=arr[startIndex];
		arr[startIndex]=arr[correctIndex];
		arr[correctIndex]=temp;
	}
}
