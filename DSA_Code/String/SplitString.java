package String;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SplitString {
    public static void main(String[] args) {
        String str="Vinay";
        splitString(str);
    }

    //using split method
    public static void splitString(String str) {
        String[] strArray=str.split("");
        for (String ch:strArray) {
            System.out.print(ch+",");
        }
        System.out.println();
        splitUsingPatternClass(str);

        System.out.println();
        //splitUsingStringTokenizer(str);
    }

    //Using Pattern Class
    public static void splitUsingPatternClass(String str){
        List<String> strList=Pattern.compile("").splitAsStream(str)
                        .collect(Collectors.toList());
        System.out.println(strList);
    }

    /*//using String Tokenizer
    public static void splitUsingStringTokenizer(String str){
        StringTokenizer t=new StringTokenizer(str,"");
        while (t.hasMoreTokens()){
            String s=t.nextToken();
            System.out.print(s+",");
        }
    }*/
}
