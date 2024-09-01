package CyclicSort;

public class MissingElement3 {
	
	public static void main(String[] args) {
		int[] nums = {0,1};
		missingNumber(nums);
		System.out.println(missingNumber(nums));
	}
	
	 public static int missingNumber(int[] nums) {

	        int givenElementSum=0;
	        int n=nums.length;
	        
	        //we know that sum of n natural no is n(n+1)/2;
	        for(int i=0;i<nums.length;i++){
	            givenElementSum+=nums[i];
	        }

	        return n*(n+1)/2-givenElementSum;
	  }

}
