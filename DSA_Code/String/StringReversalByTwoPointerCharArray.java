package String;

public class StringReversalByTwoPointerCharArray {
    public static void main(String[] args) {
        String str="Vinay is good boy";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        //convert String to an array of String
        char[] ch=str.toCharArray();
        //reverse array of String and then convert an array of String to normal String
        return new String(reverseArray(ch));
    }

    public static char[] reverseArray(char[] st) {
        int i=0;
        int j=st.length-1;
        while (i<=j){
            char temp=st[i];
            st[i]=st[j];
            st[j]=temp;
            i++;
            j--;
        }
        return st;
    }
}
