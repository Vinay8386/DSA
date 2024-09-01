package String;

public class StringReversalByTwoPointerStringArray {
    public static void main(String[] args) {
        String str="Vinay is good boy";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        //convert String to an array of String
        String[] st=str.split("");
        //reverse array of String and then convert an array of String to normal String
        return String.join("",reverseArray(st)).trim();
    }

    public static String[] reverseArray(String[] st) {
        int i=0;
        int j=st.length-1;
        while (i<j){
            String temp=st[i];
            st[i]=st[j];
            st[j]=temp;
            i++;
            j--;
        }
        return st;
    }
}
