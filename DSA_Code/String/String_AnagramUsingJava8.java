package String;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Java program to check weather two Strings is anagram (the frequency of each char in both Strings is the same) or not
public class String_AnagramUsingJava8 {
    public static void main(String[] args) {
        String str1="aab";
        String str2="bba";
        System.out.println(checkAnagram(str1,str2));
    }
    public static boolean checkAnagram(String str1, String str2) {
        Map<String, Long> str1Map=
        Arrays.stream(str1.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String, Long> str2Map=
                Arrays.stream(str2.split(""))
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return str1Map.equals(str2Map);
        //here str1Map and str2Map to be considered equal, they must contain exactly the same key-value pair
    }
}


//For two maps to be considered equal, they must contain exactly the same key-value pairs.