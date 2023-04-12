package Recursion;

public class BinarySearchUsingRecursion {
	
	public static void main(String[] args) {
		int[] arr = { 2,3,5,6,7,9 };
		int target=9;
		int ans=recursion(arr,target,0,arr.length-1);
		System.out.println(ans);
	}

	private static int recursion(int[] arr, int target, int s, int e) {
		
		if(s>e) {
			return -1;
		}
		
		int m = s+(e-s)/2;
		
		if(target==arr[m]) {
			return m;
		}else if(target>arr[m]) {
			return recursion( arr, target, m+1, e);
		}else {
			return recursion( arr, target, s, m-1);
		}
	}
}
