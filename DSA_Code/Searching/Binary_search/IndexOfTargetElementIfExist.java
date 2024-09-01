package BinarySearch;

public class IndexOfTargetElementIfExist {
	
	public static void main(String[] args) {
		
		//take an array of int type
		//this is sorted if we have not sorted array than first sort it in ascending/descending order
		int[] arr= {2,4,6,9,11,12,14,20,36,48}; // ascending order
		int[] desc= {48,36,20,14,12,11,9,6,4,2}; //descending order

		//take the target element
		int target=12;
		//take the function to write implementation
		int ans=binarysearch(arr,target);
		binarysearchDesc(desc,target);
		
		System.out.println(binarysearchDesc(desc,target));
		System.out.print(ans);
	}


	private static int binarysearch(int[] arr, int target) {
		
		//check if element exist or not if exist return index if not return -1
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)   //element exist
		{
			int mid=start+(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}else if (target>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;   //element not exist
		
	}
	
	private static int binarysearchDesc(int[] desc, int target) {
		
		//check if element exist or not if exist return index if not return -1
		
		int start=0;
		int end=desc.length-1;
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if (target<desc[mid]) {
				start=mid+1;
			} else if (target>desc[mid]) {
				end=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
