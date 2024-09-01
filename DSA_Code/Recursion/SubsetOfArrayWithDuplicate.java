package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java program to find all subsets of given array having a duplicate element using iteration
public class SubsetOfArrayWithDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> list = subSetUsingArray(arr);
        for (List<Integer> val : list) {
            System.out.println(val);
        }
    }

    public static List<List<Integer>> subSetUsingArray(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            //if current and previous element is same s=e+1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = ans.size() - 1;
            int n = ans.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(ans.get(j));
                internal.add(arr[i]);
                ans.add(internal);
            }
        }
        return ans;
    }
}
