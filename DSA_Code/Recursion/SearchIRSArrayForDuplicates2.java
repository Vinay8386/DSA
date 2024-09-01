package Recursion;

public class SearchIRSArrayForDuplicates2 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target=2;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end){

        int mid=start+(end-start)/2;

        if(target==nums[mid]) return true;

        if(start>=end)return false;

        return binarySearch(nums,target,start,mid-1) || binarySearch(nums,target,mid+1,end);
    }
}
