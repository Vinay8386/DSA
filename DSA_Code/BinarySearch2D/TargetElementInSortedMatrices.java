package BinarySearch2D;

import java.util.Arrays;

public class TargetElementInSortedMatrices {
	public static void main(String[] args) {

		int[][] arr = { { 1,2,3,4 }, 
						{ 5,6,7,8 }, 
						{ 9,10,11,12 },
						{ 13,14,15,16 } 
					};
		int target =9;
		System.out.println(Arrays.toString(searchInSortedArray(arr, target)));
	}

	public static int[] searchInSortedArray(int[][] arr, int target) {

		int rowLength = arr.length;
		int colLength = arr[0].length;

		// If we have only one row
		if (rowLength == 1) {
			return binarySearch(arr, 0, 0, colLength - 1, target);
		}

		// If we have more than one row than first get middle column
		// first get middle column
		int cStart = 0;
		int cEnd = colLength - 1;
		int midCol = cStart + (cEnd - cStart) / 2; // now it will not change

		// now get start and end position of the row
		int rStart = 0;
		int rEnd = rowLength - 1;

		// now eliminate the extra row by using start and end position of row
		while (rStart < (rEnd - 1)) {
			int midRow = rStart + (rEnd - rStart) / 2;

			if (arr[midRow][midCol] == target) { // potential answer found
				return new int[] { midRow, midCol };
			} else 
				if (arr[midRow][midCol] < target) { // eliminate all previous row because target lies after middle
				rStart = midRow;
			} else {
				rEnd = midRow; // eliminate all next row because target lies before middle element
			}
		}
		// Now we have only two row remaining so break this two row in four part by using middle column
		// before this check middle element of middle column is equal to target or not
		if (arr[rStart][midCol] == target) {
			return new int[] { rStart, midCol }; // potential answer is first row middle element
		} else {
			if (arr[rEnd][midCol] == target) {
				return new int[] { rEnd, midCol }; // potential answer is last row mddle element
			}
		}
		// first part is before mid element of first row.Search in first half
		if (target < arr[rStart][midCol]) {
			return binarySearch(arr, rStart, 0, midCol-1, target);
		} else
		// second part is after mid element of first row
		if (target > arr[rStart][midCol] && target<=arr[rStart][colLength-1]) {
			return binarySearch(arr, rStart, midCol + 1, colLength-1, target);
		} else
		// third part is before mid element of second row
		if (target>=arr[rEnd][cStart] && target < arr[rEnd][midCol]) {
			return binarySearch(arr, rEnd, 0, midCol-1, target);
		} else {
		// fourth part is after mid element of second row
			return binarySearch(arr, rEnd, midCol+1, colLength-1, target);
		}
	}

	public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {

		while (cStart <= cEnd) {

			int mid = cStart + (cEnd - cStart) / 2;

			if (arr[row][mid] == target) {
				return new int[] { row, mid };
			}
			if (arr[row][mid] > target) {
				cEnd = mid - 1;
			} else {
				cStart = mid + 1;
			}
		}
		return new int[] { -1, -1 };
	}
}
