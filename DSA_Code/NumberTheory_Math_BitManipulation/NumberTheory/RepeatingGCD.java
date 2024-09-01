package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

//This code will give NumberFormat Exception. Check optimize code
public class RepeatingGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(FindGcd(n,x,y));;
    }

    public static String FindGcd(long N, int x, int y)
    {
        // Calculate GCD of x and y
        int gcdXY = calculateGCD(x, y);
        // Convert N to string then repeat it to gcd times
        return String.valueOf(N).repeat(gcdXY);
    }
    public static int calculateGCD(int a, int b){
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }
}
