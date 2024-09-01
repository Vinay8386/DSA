package BinarySearch2D;

import java.util.Arrays;

public class TargetElementInSortedRowColOfMatrices2 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40, 45 }, 
						{ 15, 25, 35, 45, 50 }, 
						{ 28, 29, 37, 49, 55 }, 
						{ 33, 34, 387, 50, 60} };
		int target = 55;
		System.out.println(Arrays.toString(search(arr, target)));
	}

	public static int[] search(int[][] arr, int target) {

		int r = 0;
		int c = arr[0].length - 1;

		while (r < arr.length && c >= 0) {

			if (arr[r][c] == target) {
				return new int[] { r, c};
			} else if (arr[r][c] > target) {
				c--;
			} else {
				r++;
			}
		}
		return new int[] { -1, -1 };
	}

}
