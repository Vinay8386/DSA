package Recursion;

//Java program to remove "Ja" if word is Java from the entire line of String
public class RemoveStringFromString2 {
    public static void main(String[] args) {
        String s = "Jarbage please remove Ja from core Java & Advance Java";
        System.out.println(removeJava("", s));
    }

    public static String removeJava(String ans, String s) {
        if (s.isEmpty()) return ans;
        char ch = s.charAt(0);
        if (s.startsWith("Java")) {
            return removeJava(ans, s.substring(2));
        } else {
            return removeJava(ans + ch, s.substring(1));
        }
    }
}
