package Recursion;

import java.util.ArrayList;

//Java program to find all subsets with ascii value of given String
public class SubsetOfStringWithASCIIValue {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subSet("", s));
    }

    public static ArrayList<String> subSet(String ans, String s) {
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> left = subSet(ans + s.charAt(0), s.substring(1));
        ArrayList<String> middle = subSet(ans+(int)s.charAt(0), s.substring(1));
        ArrayList<String> right = subSet(ans, s.substring(1));
        left.addAll(middle);
        left.addAll(right);
        return left;
    }
}
