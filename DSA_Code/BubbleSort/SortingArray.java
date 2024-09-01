package BubbleSort;

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String[] args) {
		
		int[] arr= {5,3,4,2,1};
		//int[] arr= {10,11,12,13,14};
		
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		boolean swapped = false;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			//if you didn't swap for a particular value of i=0, it means array is already sorted so stop the swapping
			//In case of atleast one swapping i will increase and loop will continue till no swapping at any any particular value of i
			if(!swapped) {
				break;
			}
		}
	}
}
