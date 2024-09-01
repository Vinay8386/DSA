package String;

import java.util.Optional;

//Remove part of String from given String
public class RemoveSubstring {
    public static void main(String[] args) {
        String str="Vinay Kumar Mishra";
        System.out.println(removeMishra(str));

        //By using Java8
        String resultString= Optional.ofNullable(str)
                .map(s->s.replace("Mishra",""))
                .map(String::trim)      //trim remove any leading or trailing spaces that may be left after the removal
                .orElse(str);      //fallback to original String if something goes wrong
        System.out.println(resultString);
    }

    //remove Mishra
    public static String removeMishra(String str) {
        return str.replace("Mishra","").trim();
    }
}
