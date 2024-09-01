package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;

public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(trailingZeroes(a));
    }
    public static int trailingZeroes(int n) {
        int sum_2=0;
        int sum_5=0;
        for(int i=1;Math.pow(2, i)<=n;i++){
            sum_2+=(n/(Math.pow(2, i)));
        }
        for(int i=1;Math.pow(5, i)<=n;i++){
            sum_5+=(n/Math.pow(5, i));
        }
        return Math.min(sum_2,sum_5);
    }
}

/*
Description:
In integer trailing zero occur when the number has factor of 10 except 1 & 10;
Factor of 10 except 1 & 10 is : 2,5
step-1) Calculate how many 2 are available from 2 to N
=>No of 2 from 2 to N is : N/pow(2,i), where pow(2,i)<=N
step-2) calculate how many 5 are available from 2 to N
=>No of 5 from 2 to N is : N/pow(5,i), where pow(5,i)<=N
step-3) trailing zeros = minimum of (no of 2 & no of 5) available in 2 to N
Example: n=16, minumum of ((16/2)+(16/4)+(16/8)+(16/16),(16/5))
 */