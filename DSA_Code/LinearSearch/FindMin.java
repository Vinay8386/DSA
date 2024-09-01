package LinearSearch;

public class FindMin {
	public static void main(String[] args) {
		int[] arr= {23,32,12,45,33,74,9};
		
		System.out.println(findMin(arr));
	}

	 static int findMin(int[] arr) {
		 int min=arr[0];
		if(arr.length==0) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	 
	 //using enhance for loop
	 static int findMin2(int[] arr) {
		 int min=arr[1];
		if(arr.length==0) {
			return -1;
		}
		for (int i :arr) {
			if(i<min) {
				min=i;
			}
		}
		return min;
	}

}
