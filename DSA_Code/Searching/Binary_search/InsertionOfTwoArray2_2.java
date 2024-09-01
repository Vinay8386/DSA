package Searching.BinarySearch;

import java.util.Arrays;

public class InsertionOfTwoArray2_2 {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(intersect(nums1, nums2));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] intersectionArray = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                intersectionArray[index++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOf(intersectionArray, index);
    }
}
