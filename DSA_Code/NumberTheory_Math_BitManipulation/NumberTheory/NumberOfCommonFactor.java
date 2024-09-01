package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

public class NumberOfCommonFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(calculate(a,b));
    }
    private static int calculate(int a, int b) {
        int count=0;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}
