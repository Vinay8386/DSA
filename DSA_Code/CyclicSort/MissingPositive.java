package CyclicSort;

import java.util.Arrays;

public class MissingPositive {
	public static void main(String[] args) {
		
		int[] nums= {-2,-5,1,3,4};
		
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {

		Arrays.sort(nums); //It will sort number in ascending order
		int check = 1;
		for (int k : nums) {
			if (k < check) {
				continue;
			} else if (k == check) {
				check++;
			} else {
				return check;
			}
		}
		return check;
	}
}
