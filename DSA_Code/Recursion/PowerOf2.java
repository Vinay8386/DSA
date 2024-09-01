package Recursion;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        if(n==1) return true;
        if(n%2==0){
            return isPowerOfTwo(n/2);
        }else{
            return false;
        }
    }
}
