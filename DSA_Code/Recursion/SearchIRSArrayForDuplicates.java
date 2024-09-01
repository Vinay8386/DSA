package Recursion;

public class SearchIRSArrayForDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target=2;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end){

        if(start>end) return false;

        int mid=start+(end-start)/2;

        if(target==nums[mid]) return true;

        //If we have duplicates
        if(nums[start]==nums[mid] && nums[mid]==nums[end]){
            return binarySearch(nums,target,start+1,end-1);
        }else
        //case-1
        if(nums[mid]>=nums[start]){
            if(target>=nums[start] && target<=nums[mid]){
                return binarySearch(nums,target,start,mid-1);
            }
            return binarySearch(nums,target,mid+1,end);
        }else
        if(target>=nums[mid] && target<=nums[end]){
            return binarySearch(nums,target,mid+1,end);
        }
        return binarySearch(nums,target,start,mid-1);
    }
}
