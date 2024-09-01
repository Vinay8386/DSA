package Recursion;

import java.util.ArrayList;
import java.util.HashSet;

public class PermutationOfStringHavingDuplicate {
    public static void main(String[] args) {
        System.out.println(permutationList("", "abac"));
    }

    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        HashSet<String> set=new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String prefix_subString = p.substring(0, i);
            String suffix_subString = p.substring(i);
            String newPerm = prefix_subString + ch + suffix_subString;

            if (set.contains(newPerm)) {
                continue;
            } else {
                set.add(newPerm);
            }
            ans.addAll(permutationList(newPerm, up.substring(1)));
        }
        return ans;
    }
}
