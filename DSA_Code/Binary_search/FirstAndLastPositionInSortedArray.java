package BinarySearch;

import java.util.Arrays;

//In sorted ascending order array number find starting and ending position of a given target value
	//If target is not found in the array , return [-1,-1]
	//you must wrote an algorithm with o(log n) runtime complexity
	//target= 8 op=[3,4]	//target= 6 op=[-1,-1]		//target= 0 op=[-1,-1]

public class FirstAndLastPositionInSortedArray {
	
	public static void main(String[] args) {
		
		int[] nums= {5,7,7,8,8,10};
		int target=8;
		positionOfArray(nums,target);   
		System.out.println(Arrays.toString(positionOfArray(nums,target)));
	}
	public static int[] positionOfArray(int[] nums, int target) {
		
		int[] ans= {-1,-1};		
		ans[0]=searchPosition(nums,target, true);
		//here we take true because once findStartIndex will false it won't go in else condition (line 49) and start serching in left side (first occurence)

		if(ans[0]!=-1) {
			ans[1]=searchPosition(nums,target, false);  
			//here we take false because once findStartIndex will false it will go in else condition (line 49) and start serching in right side (last occurence)
		}
		return ans;	
	}
	private static int searchPosition(int[] nums, int target, boolean findStartIndex) {
		
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		while(start<=end) {

			int mid=start+(end-start)/2;
			if(target<nums[mid]) {
				end=mid-1;
			}
			else if(target>nums[mid]) {
				start=mid+1;
			}else {
				//potential answer found
				//here target=mid element but it maybe possible that same element is in left side & right side also 
				//so we have to check first element in left side and last element in right side 
				ans=mid;
				if(findStartIndex) {   //use findStartIndex to find the first occurence 
					end=mid-1;
				}else {
					start=mid+1;		
				}
			}
		}
		return ans;
	}
}
