package BinarySearch;

public class OrderAgnosticBinarySearch {
	//If we don't know order of our array weather it is in ascending or descending order than we have to check first 
	//it is in ascending order or descending order and than apply the condition
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10}; //Ascending order
		//int[] arr= {10,8,6,4,2};	//descending order

		int target=8;
		binarySearchOrderAgnostic(arr,target);
		System.out.println(binarySearchOrderAgnostic(arr,target));
	}

	private static int binarySearchOrderAgnostic(int[] arr, int target) {
		
		int start=0;
		int end=arr.length-1;
		
		boolean isAsc=arr[start]<arr[end];
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if(target==arr[mid]) {
				return mid;
			}
			if(isAsc) {					//if element of array is in ascending order
				if(target<arr[mid]) {
					end=mid-1;
				}else {
					start=mid+1;
				}
				
			}else {						//if element of array is in descending order
				if(target<arr[mid]) {
					start=mid+1;
				}else {
					end=mid-1;
				}
				
			}
		}
		return -1;
	}

}
