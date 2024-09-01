package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;
//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        int result=0;
        if(x<0){
            return -reverseInteger(-x,result);
        }else{
            return reverseInteger(x,result);
        }
    }
    static int reverseInteger(int x, int result){
        while(x!=0){
            result=((result*10)+(x%10));

            //exceed int range
            if(result%10!=x%10){
                return 0;
            }

            x/=10;
        }
        return result;
    }
}
