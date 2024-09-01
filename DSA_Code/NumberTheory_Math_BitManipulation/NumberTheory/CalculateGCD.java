package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

public class CalculateGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is : " + calculate(a, b));
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is : " + calculate2(a, b));
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is : " + calculateUsingRecursion(a, b));
    }
    //Maybe this code will give time limit exceeds error
    private static int calculate(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //optimize code using iteration
    private static int calculate2(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
    //optimize code using Recursion
    private static int calculateUsingRecursion(int a, int b) {
        if (b == 0) return a;
        return calculateUsingRecursion(b, a % b);
    }

}
