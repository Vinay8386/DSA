package String;

//Java program to check weather two Strings is anagram (the frequency of each char in both Strings is the same) or not
public class String_Anagram {
    public static void main(String[] args) {
        //Initialize two string objects
        String str1="abb";
        String str2="bba";
        System.out.println(checkAnagram(str1,str2));
    }
    public static boolean checkAnagram(String str1, String str2) {
        //The original ASCII character set uses 7 bits to represent each character, allowing for 128 unique characters (from 0 to 127).
        //Extended ASCII is an 8-bit character set that includes the standard ASCII characters plus an additional 128 characters, making it a total of 256 (from 0 to 255).
        //So Let's create an array and initialize with size 256
        int[] count=new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0) return false;
        }
        return true;
    }
}
/*
str.charAt(i) return character present at ith position
count[str1.charAt(i)] use ASCII value as an index to access the specific location in the count array
count[str1.charAt(i)]++ increment the value by 1 at that index in the count array
Note: When a character is used as an array index, it is automatically converted to its corresponding integer value (Unicode code point)
 */