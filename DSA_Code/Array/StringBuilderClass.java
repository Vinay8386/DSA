package Array;

public class StringBuilderClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num);
        }
        //In the context of println() method, sb.toString() is called implicitely to convert the StringBuilder object to a String Before printing it.
        System.out.println("Array as String: " + sb);
    }
}
