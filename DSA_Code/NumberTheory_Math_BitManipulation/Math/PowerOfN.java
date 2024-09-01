package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;

public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int base= sc.nextInt();
        System.out.println(isPowerOfFour(a,base));
    }
    public static boolean isPowerOfFour(int n, int base) {
        if(n<=0) return false;
        while(n>1){
            if(n%base==0){
                n/=base;
            }else{
                return false;
            }
        }
        return true;
    }
}
