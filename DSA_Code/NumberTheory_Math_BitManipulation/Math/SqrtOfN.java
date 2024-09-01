package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;
//Find square roor of a number
public class SqrtOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(mySqrt(n));
    }
    public static int mySqrt(int i) {
        if(i<=1) return i;
        long sqr=2;
        while(sqr*sqr<=i){
            sqr++;
        }
        return (int)sqr-1;
    }
}
//In this case, if n is bigger for ex-5000000, square root will be 2300 in int
//so loop will run 2300 times to identify this
//So for better solution refer SqrtOfN2