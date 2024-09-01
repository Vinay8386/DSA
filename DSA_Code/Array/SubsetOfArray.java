package Array;

import java.util.ArrayList;
import java.util.List;

//Java program to find all subsets of given array using iteration
public class SubsetOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> list = subSetUsingArray(arr);
        for (List<Integer> val : list) {
            System.out.println(val);
        }
    }

    public static List<List<Integer>> subSetUsingArray(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for (int num : arr) {
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(ans.get(i));
                internal.add(num);
                ans.add(internal);
            }
        }
        return ans;
    }
}
