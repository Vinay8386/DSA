package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Print the String having even length
public class EvenLengthString {
    public static void main(String[] args) {
        String str="Vinay Kumar Mishra";
        System.out.println(evenLength(str));

        //using Java8
        List<String> list=
        Arrays.stream(str.split(" "))
                .filter(s->s.length()%2==0)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    /*public static void evenLength(String str) {
        //split the string with its space
        String[] arr=str.split(" ");
        for (String s:arr) {
            if(s.length()%2==0){
                System.out.println(s);
            }
        }
    }*/

    public static List<String> evenLength(String str) {
        List<String> list=new ArrayList<>();
        //split the string with its space
        String[] arr=str.split(" ");
        for (String s:arr) {
            if(s.length()%2==0){
               list.add(s);
            }
        }
        return list;
    }
}
