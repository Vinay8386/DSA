package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

//check number is factorial_number(retrn 1) or not(return 0)
public class CheckFactorialNumberOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkFactorialNumber(n));;
    }

    private static int checkFactorialNumber(int N) {
        //code here
        int result=1;
        int i=1;
        while (result<=N){
            if(result==N){
                return 1;
            }
            result*=i;
            i++;
        }
        return 0;
    }
}
