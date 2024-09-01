package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        for (int val:plusOne(digits)
             ) {
            System.out.print(val+" ");
        }
    }
    public static int[] plusOne(int[] digits) {
        int carry=1;  // Initial carry is 1 since we are incrementing by one
        for(int i=digits.length-1; i>=0; i--){
            int sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }
        // If there's a carry after the loop, it means we need to add an extra digit
        if(carry>0){
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, digits.length); //adding elements of one array in another array
            return result;
        }else{
            return digits;
        }
    }
}
