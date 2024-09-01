package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(isPowerOfFour(a));
    }
    public static boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        while(n>1){
            if(n%4==0){
                n/=4;
            }else{
                return false;
            }
        }
        return true;
    }
}
