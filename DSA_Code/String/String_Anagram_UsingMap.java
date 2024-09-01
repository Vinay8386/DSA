package String;

import java.util.HashMap;
import java.util.Map;

//Java program to check weather two Strings is anagram (the frequency of each char in both Strings is the same) or not
public class String_Anagram_UsingMap {
    public static void main(String[] args) {
        String str1="abb";
        String str2="bba";
        System.out.println(checkAnagram(str1,str2));
        System.out.println(checkAnagram2(str1,str2));
    }
    public static boolean checkAnagram(String str1, String str2) {

        //check if the length of both strings is equal or not
        if(str1.length()!=str2.length()) return false;

        //count the frequency of each character of str1
        Map<Character,Integer> count1=new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            count1.put(str1.charAt(i),count1.getOrDefault(str1.charAt(i),0)+1);
        }
        Map<Character, Integer> count2=new HashMap<>();
        for(int i=0;i<str2.length();i++){
            count2.put(str2.charAt(i),count2.getOrDefault(str2.charAt(i),0)+1);
        }

        return count1.equals(count2);
    }

    public static boolean checkAnagram2(String str1, String str2) {

        //check if the length of both strings is equal or not
        if(str1.length()!=str2.length()) return false;

        //Iterate over str1 and increment freq by 1 then iterate over str2 and decrement freq by 1
        Map<Character,Integer> count=new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            count.put(str1.charAt(i),count.getOrDefault(str1.charAt(i),0)+1); //increase the frequency of character by 1
            count.put(str2.charAt(i),count.getOrDefault(str2.charAt(i),0)-1); //decrease the frequency of character by 1
        }
        for(int freq:count.values()){
            if(freq!=0){
                return false;
            }
        }
        return true;
    }
}
