package CyclicSort;

import java.util.Arrays;

public class MissingNumber2 {
	public static void main(String[] args) {
		int[] arr = {0,1};
		missingNum(arr);
		System.out.println(missingNum(arr));
	}

	public static int missingNum(int[] arr) {
		
		//int maxValue=Arrays.stream(arr).max().getAsInt();
		//the above maxValue is wrong because if we have arr [0,1], here n=2 it means all numbers are in the range [0,2]
		//since 2 doesn't appear in arr so 2 is missing number
		
		int maxValue=arr.length;
		//sum of n natural number is n(n+1)/2. beacause missing number is in between 1 to N
		int expectedSum=maxValue*(maxValue+1)/2;
		
		//sum of all element of given array
		int actualSum=Arrays.stream(arr).sum();
		
		int missingNumber=expectedSum-actualSum;
		
		int indexOfMissingNumber=missingNumber-1; //if we want missing number index
		
		return missingNumber;
		
	}
	
}
