package String;

//Compare two String in Java to check it is equal or not without using built in finction
public class CompareString {
    public static void main(String[] args) {
        String str1="Vinay";
        String str2="vinay";

        System.out.println(compareString(str1,str2));
        System.out.println(compareUsingEquals(str1,str2));
        System.out.println(compareUsingEqualsIgnoreCase(str1,str2));
        if(compareUsingCompareTo(str1,str2)!=0){
            System.out.println("String is not equal");
            System.out.println("Here unicode value of one String is less/greater than other, so it is not equal");
        }else {
            System.out.println("String is equal");
        }

        if(compareUsingCompareToIgnoreCase(str1,str2)!=0){
            System.out.println("String is not equal");
            System.out.println("Here unicode value of one String is less/greater than other, so it is not equal");
        }else {
            System.out.println("String is equal");
        }
    }

    //It will ignore the case and than compare
    public static int compareUsingCompareToIgnoreCase(String str1, String str2) {
        return str1.compareToIgnoreCase(str2);
    }

    public static int compareUsingCompareTo(String str1, String str2) {
        return str1.compareTo(str2);
    }

    //It will ignore case
    public static boolean compareUsingEqualsIgnoreCase(String str1, String str2) {
        if(str1.equalsIgnoreCase(str2)){
            return true;
        }else {
            return false;
        }
    }

    //It will not ignore case
    public static boolean compareUsingEquals(String str1, String str2) {
        if(str1.equals(str2)){
            return true;
        }else {
            return false;
        }
    }
    //It will not ignore case
    public static boolean compareString(String str1,String str2){
        if(str1.length()!=str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)!=str2.charAt(i)){
               return false;
            }
        }
        return true;
    }
}
