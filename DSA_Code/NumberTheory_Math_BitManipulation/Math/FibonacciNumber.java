package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fib(n));
    }
    /*public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }*/
    public static int fib(int n) {
        return Stream.iterate(new int[]{0,1},x->new int[]{x[1],x[0]+x[1]})
                .limit(n+2)
                .map(x->x[0])
                .collect(Collectors.toList())
                .get(n);
    }
}
