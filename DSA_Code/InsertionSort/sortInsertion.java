package InsertionSort;

import java.util.Arrays;

public class sortInsertion {
	
	public static void main(String[] args) {
		int[] arr = {0,-23,56,18};
		sortInsertion1(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sortInsertion1(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}else {
					break;
				}
			}
		}
	}
	public static void swap(int[] arr, int lastIndex, int previousIndex) {
		int temp=arr[lastIndex];
		arr[lastIndex]=arr[previousIndex];
		arr[previousIndex]=temp;
	}

}
