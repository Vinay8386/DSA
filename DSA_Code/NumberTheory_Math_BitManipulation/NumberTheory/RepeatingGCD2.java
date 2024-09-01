package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

//This code will give NumberFormat Exception. Check optimize code
public class RepeatingGCD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        FindGcd(n,x,y);
    }
    public static String FindGcd(long N, int x, int y)
    {
        //calculate A & B
        long A=calculateNumber(N,x);
        long B=calculateNumber(N,y);
        //calculate GCD of A & B
        return Long.toString(calculateGCD(A,B));
    }
    public static long calculateNumber(long n,int x){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<x;i++){
            s.append(n);
        }
        return Long.parseLong(s.toString());
    }
    public static long calculateGCD(long a, long b){
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }
}
