package Array;

import java.util.Arrays;

public class ToStringMethod {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        //print object
        System.out.println("Without String representation, arr value is : "+arr);
        //Print String representation of an arr object
        System.out.println("String representation, arr value is : "+ Arrays.toString(arr));
    }
}
