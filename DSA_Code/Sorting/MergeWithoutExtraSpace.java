package Sorting;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        long[] arr1={10,12};
        long[] arr2={5,18,20};
        merge(arr1,arr2, arr1.length, arr2.length);
    }
    public static void merge(long[] arr1, long[] arr2, int n, int m)
    {
        int i = n - 1;
        int j = 0;

        // Iterate through the elements of arr1 and arr2
        while (i >= 0 && j < m) {
            // If the last element of arr1 is greater than the first element of arr2
            // Swap arr1[i] and arr2[j]
            if (arr1[i] > arr2[j]) {
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        // Sort arr1 in ascending order (already sorted, but may have been modified)
        Arrays.sort(arr1);
        for (long val:arr1
             ) {
            System.out.print(val+" ");
        }
        // Sort arr2 in ascending order
        Arrays.sort(arr2);
        for (long val:arr2
        ) {
            System.out.print(val+" ");
        }
    }
}
