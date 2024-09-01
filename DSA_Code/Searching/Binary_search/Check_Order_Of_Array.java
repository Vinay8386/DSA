package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

//take an array and check it is in ascending order or descending order or not in order 
//solve after time complexity
public class Check_Order_Of_Array {
	
	public static void main(String[] args) {
		
		int[] num=new int[7];
		checkOrderOfArray(num);
	}

	private static void checkOrderOfArray(int[] num) {
		
		for(int i=0; i<num.length;i++) {
			Scanner sc=new Scanner(System.in);
			num[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		
		//check value is in ascending order or not
		
	}

}
