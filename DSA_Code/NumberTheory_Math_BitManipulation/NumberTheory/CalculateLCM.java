package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

//LCM(12, 18) = (12 * 18) / GCD(12, 18) = (216) / 6 = 36.
public class CalculateLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Least Common Multiple of "+a+" and "+b+" is : "+calLCM(a,b));
    }
    private static int calLCM(int a, int b) {
        return (a*b)/caculateGCD(a,b);
    }
    private static int caculateGCD(int a, int b) {
        if (b == 0) return a;
        return caculateGCD(b, a % b);
    }
}
