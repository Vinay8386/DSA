package CyclicSort;

public class MissingNumber4 {
	public static void main(String[] args) {
		int[] nums = {0,1};
		missingNumber(nums);
		System.out.println(missingNumber(nums));
	}
	public static int missingNumber(int[] nums) {

        int givenElementSum=0;
        int n=nums.length;
        for(int k:nums) {
        	givenElementSum+=k;
        }
        return n*(n+1)/2-givenElementSum;
  }

}
