package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

//Optimize code
public class RepeatingGCD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        FindGcd(n,x,y);
    }
    public static String FindGcd(long N, int x, int y)
    {
        //create number A
        long A=Long.parseLong(String.valueOf(N).repeat(x));
        //create number B
        long B=Long.parseLong(String.valueOf(N).repeat(y));
        return String.valueOf(calculateGCD(A,B));
    }
    public static long calculateGCD(long a, long b){
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }
}
