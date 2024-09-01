package Sorting;

public class DuplicateInRange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(findDuplicatesUsingHeapSort(arr));
    }

    //Approach-1  T(n)=O(n^2) A.S=O(1)
    private static boolean findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Approach-1  T(n)=O(NlogN) A.S=O(1)
    private static boolean findDuplicatesUsingHeapSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
