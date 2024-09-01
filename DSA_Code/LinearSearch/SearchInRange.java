package LinearSearch;

public class SearchInRange {
	public static void main(String[] args) {
		//take an array and serach this array in particular range of index like search 5 in the range 4-8
		
		int[] arr= {2,4,3,5,6,8,9};
		int target=8;
		int start = 1;
		int end=5;
		int ans=searchInrange(arr,target, start, end);
		System.out.println(ans);
		boolean ans2=searchInrange2(arr,target);
		System.out.println(ans2);
		
	}

		static int searchInrange(int[] arr, int target,int start,int end) {
		if(arr.length==0) {
			return -1;
		}
		
		for (int i = start; i <= end; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
		
		//using enhance for loop
		static boolean searchInrange2(int[] arr, int target) {
			if(arr.length==0) {
				return false;
			}
			
			for(int k:arr) {
				if(target==k) {
					return true;
				}
			}
			return false;
		}

}
