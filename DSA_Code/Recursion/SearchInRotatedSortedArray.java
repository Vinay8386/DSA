package Recursion;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=3;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {

        int mid=start+(end-start)/2;

        if(target==nums[mid]) return mid;

        if(nums[start]==nums[end]) return -1;
        //case-1
        if(nums[start]<=nums[mid]){
            if(target>=nums[start] && target<=nums[mid]){
               return binarySearch(nums,target,start,mid-1);
            }else {
               return binarySearch(nums,target,mid+1,end);
            }
        }
        //case-2
        if(target>=nums[mid] && target<=nums[end]){
            return binarySearch(nums,target,mid+1,end);
        }
        return binarySearch(nums,target,start,mid-1);
    }
}
