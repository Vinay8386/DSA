package Sorting;

import  java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }
    public static Set<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return set;
    }
}
