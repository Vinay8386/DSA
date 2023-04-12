package BinarySearch;

public class MountainArrayOrBitonicArray {
	public static void main(String[] args) {
		int[] arr= {4,3,1,0};
		mountainArray(arr);
		System.out.println(mountainArray(arr));
		System.out.println("peak element of mountain array : "+arr[mountainArray(arr)]);
	}

	private static int mountainArray(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
		
		while (start<end) {
			
			int mid=start+(end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				//you are in descending part of array
				//this may be an ans but look at left because maybe end
				end=mid;
			}else{
				//you are in ascending part of array
				start=mid+1;
			}	
		}
		//In the end, start==end and and pointing to the largest number because of the 2 checks above
		//start and end are always trying to find max element in the above 2 checks
		//hence, when they are pointing to just one element,that is the max one because that is what the checks say
		//more elaboration: at every point of time for start and end , they have the best possible answer till that time
		//and if we are saying only one item is remaining, hence because of above line that is the best possible answer
		
		return start;  //or return end as both are equal
	}
}
