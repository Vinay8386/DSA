package String;

public class SkipWordFromString {
    public static void main(String[] args) {
        System.out.println(skipString("Ram name is khan naik"));
    }

    private static String skipString(String s) {
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(s.startsWith("name")){
            return skipString(s.substring(5)); //skip 5 becuse of skipping one extra space also for name we used 4 only
        }else {
            return ch+skipString(s.substring(1));
        }
    }
}
