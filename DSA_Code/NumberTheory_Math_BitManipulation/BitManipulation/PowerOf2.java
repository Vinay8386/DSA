package NumberTheory_Math_BitManipulation.BitManipulation;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        // Edge case: If the number is non-positive, it can't be a power of two
        if (n <= 0) {
            return false;
        }
        // Use bitwise AND operation to check if there is only one bit set
        return (n & (n - 1)) == 0;
    }
}
