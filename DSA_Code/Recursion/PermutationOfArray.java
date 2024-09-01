package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 2};
        //Convert this array to String without any delimeter
        StringBuilder sb=new StringBuilder();
        for (int val:array) {
            sb.append(val);
        }
        //take one by one String from permutation result and convert it into an array
        List<String> resultList = new ArrayList<>();
        for (String str : permutationList("", sb.toString())) {
            resultList.add(Arrays.toString(str.split("")));
        }
        //After conversion, add all arrays in a list and return it
        System.out.println(resultList);
    }
    //Find permutation of String
    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String prefix_subString = p.substring(0, i);
            String suffix_subString = p.substring(i);
            ans.addAll(permutationList(prefix_subString + ch + suffix_subString,
                    up.substring(1)));
        }
        return ans;
    }
}
