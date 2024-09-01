package NumberTheory_Math_BitManipulation.Math;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int result=0;
        int digit=x;
        while(digit!=0){
            result=result*10+(digit%10);
            digit/=10;
        }
        if(result!=x){
            return false;
        }else{
            return true;
        }
    }

    /*public boolean isPalindrome(int x) {
        if(x<0) return false;
        int result=0;
        int digit=x;
        while(digit!=0){
            result=result*10+(digit%10);
            digit/=10;
        }
        return result==x; //If the value of result is equal to the value of x, then the expression evaluates to true else false.
    }*/
}
