package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

//Check no is prime or not
public class CheckNoIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isPrime2(n));
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if(n%i==0){
               return false;
            }
        }
        return true;
    }
    //optimize code
    private static boolean isPrime2(int n) {
        if(n<=1) return false;
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
//In this code loop will run approx n times
//For lesser complexity check PrimeNo2.java
