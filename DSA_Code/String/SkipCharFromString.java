package String;

//skip char from array
public class SkipCharFromString {
    public static void main(String[] args) {
        System.out.println(skipChar("abcaad"));
        System.out.println(skipChar2("abcaad"));
    }

    private static String skipChar(String s) {
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(ch=='a'){
            return skipChar(s.substring(1));
        }else {
            return ch+skipChar(s.substring(1));
        }
    }

    private static String skipChar2(String s) {
        return s.replaceAll("a","").trim();
    }
}
