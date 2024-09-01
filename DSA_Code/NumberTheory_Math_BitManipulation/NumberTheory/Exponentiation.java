package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int n= sc.nextInt();
        System.out.println(calculateValue(a,n));;
    }

    static long calculateValue(int a, long b) {
        long m = 1000000007;
        long result = 1;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            // Cast 'a' to long before performing the multiplication
            a = (int)(((long)a * a) % m);
            b /= 2;
        }
        return result % m;
    }
}
