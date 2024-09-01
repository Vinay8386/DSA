package String;

public class AddIntegerString {
    public static void main(String[] args) {
        String str1="111";
        String str2="222";
        System.out.println(addString(str1,str2));
        System.out.println(addString2(str1,str2));
    }

    private static String addString(String str1, String str2) {
        return String.valueOf(Integer.valueOf(str1)+Integer.valueOf(str2));
    }
    private static String addString2(String str1, String str2) {
        return String.valueOf(Integer.parseInt(str1)+Integer.parseInt(str2));
    }
}
