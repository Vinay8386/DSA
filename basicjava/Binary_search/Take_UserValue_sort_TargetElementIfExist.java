package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

//here we take value from user and sort it in ascending order and than check the target element available or not
//if available return index of target element if not available return -1

public class Take_UserValue_sort_TargetElementIfExist {
	
	public static void main(String[] args) {
		
		int[] num = new int[5];
		sortAscendingByTakingValueFromUser(num);
	}
	
	public static void sortAscendingByTakingValueFromUser(int[] num) {

		for (int i = 0; i < num.length; i++) {
			Scanner sc = new Scanner(System.in);
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		int target=2;
		binarySearch(num,target);
		System.out.println(binarySearch(num,target));

	}

	private static int binarySearch(int[] num, int target) {
		
		int start=0;
		int end=num.length-1;
		
		while(start<=end)   //element exist
		{
			int mid=start+(end-start)/2;
			
			if(target<num[mid]) {
				end=mid-1;
			}else if (target>num[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
