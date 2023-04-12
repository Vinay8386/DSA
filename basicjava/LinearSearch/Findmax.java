package LinearSearch;

public class Findmax {
	
	public static void main(String[] args) {
		int[] arr= {43,32,12,45,33,74,9};		
		System.out.println(findMax2(arr));
	}	
		 static int findMax(int[] arr) {
			 int max=arr[0];
			if(arr.length==0) {
				return -1;
			}
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
		 
		 //using enhance for loop
		 static int findMax2(int[] arr) {
			 int max=arr[4];
			if(arr.length==0) {
				return -1;
			}
			for (int i :arr) {
				if(i>max) {
					max=i;
				}
			}
			return max;
		}
}
