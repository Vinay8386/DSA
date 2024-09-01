package String;

//only skip na if it is not equal to name
public class SkipNaIfNotEqualToName {
    public static void main(String[] args) {
        System.out.println(Skipna("Ram name is khan nayak"));
    }

    private static String Skipna(String s) {
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(s.startsWith("na") && !s.startsWith("name")){
            return Skipna(s.substring(2));
        }else {
            return ch+ Skipna(s.substring(1));
        }
    }
}
