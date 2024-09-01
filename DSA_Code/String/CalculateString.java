package String;

//Java program to calculate the number of Strings in given String
public class CalculateString {
    public static void main(String[] args) {
        String str="Vinay is a good boy";
        System.out.println(calculateString(str));
        System.out.println(calculateString3(str));
    }

    public static int calculateString(String str) {
        String[] arr=str.split(" ");
        int count=0;
        for (String s:arr) {
            count++;
        }
        return count;
    }

    public static int calculateString3(String str) {
        char[] arr=str.toCharArray();
        int count=0;
        for (char s:arr) {
            count++;
        }
        return count;
    }

    /*public static int calculateString2(String str) {
        int i=0;
        for (char ch:str.charAt(i)) {

        }
        int count=1;
        for (String s:arr) {
            count++;
        }
        return count;
    }*/
}
