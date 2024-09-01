package Searching.BinarySearch;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        //int arr[] = { 1, 2, 3, 4 };
        //int arr[] = { 3,4,5,1,2 };
        int arr[] = { 1,1,1 };
        boolean x = check(arr);
        if (x == true)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static boolean check(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                a++;
            }else{
                b++;
            }
        }
        if(b==0)return true;
        if (b==1) {
            if(nums[0]>nums[nums.length-1])return true;
        }else {

        }
        return false;
    }
}
