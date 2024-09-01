package Searching.BinarySearch;

import java.util.*;

public class InsertionOfTwoArray2 {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(intersect(nums1, nums2));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        for (int v:nums1) {
            m.put(v,m.getOrDefault(v,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            for (int v:nums2) {
                if(entry.getKey()==v && entry.getValue()>0){
                    list.add(entry.getKey());
                    entry.setValue(entry.getValue()-1);
                }
            }
        }
        // Convert a list to array
        int[] intersectionArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intersectionArray[i] = list.get(i);
        }
        return intersectionArray;
    }
}
