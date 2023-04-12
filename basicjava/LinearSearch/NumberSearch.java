package LinearSearch;

public class NumberSearch {
	public static void main(String[] args) {
		int[] num= {2,3,4,5,24,45,75};
		int target=24;
		int ans=linearSearch2(num,target);
		System.out.println(ans);	
	}
	
	static int linearSearch(int[] arr,int target)
	{
		if(arr.length==0) {
			return -1;
		}
		
		//return the index
		for (int i = 0; i < arr.length; i++) {
			//check for element at every index if it is = target
			if(arr[i]==target) {
				System.out.print("element is : "+arr[i]+" And index is : ");
				return i;
							}
		}
		
		return Integer.MAX_VALUE;
		//this willreturn if none of the return statement above have excuted
		//hence the target not found
	}
	
	
	//using enhance for loop
	static int linearSearch2(int[] arr,int target)
	{
		if(arr.length==0) {
			return -1;
		}
		for(int k:arr){
			if(k==target) {
				return k;
					}
				}	
		return Integer.MAX_VALUE;
		
	}
}





