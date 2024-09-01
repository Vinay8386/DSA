package Recursion;

//Java program to remove "Java" from given line of String
public class RemoveStringFromString {
    public static void main(String[] args) {
        String s = "Java means core Java + Advance Java";
        System.out.println(removeJava("", s));
    }

    public static String removeJava(String ans, String s) {
        if (s.isEmpty()) return ans;
        char ch = s.charAt(0);
        if (s.startsWith("Java")) {
            return removeJava(ans, s.substring(4));
        } else {
            return removeJava(ans + ch, s.substring(1));
        }
    }
}
