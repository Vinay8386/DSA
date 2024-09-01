package Recursion;

//Java program to remove char k from given String
public class RemoveCharFromString {
    public static void main(String[] args) {
        String s = "Vinayk";
        System.out.println(removeChar("", s));
        ;
    }

    public static String removeChar(String ans, String s) {
        if (s.isEmpty()) {
            return ans;
        }
        char ch = s.charAt(0);
        if (ch == 'k') {
            return removeChar(ans, s.substring(1));
        } else {
            return removeChar(ans + ch, s.substring(1));
        }
    }
}
