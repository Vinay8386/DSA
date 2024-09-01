package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        System.out.println(permutationList("", "abc"));
    }

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
