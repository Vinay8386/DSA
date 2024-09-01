package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

//Find all factorial numbers less than or equal to N
public class FindAllFactorialNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(factorialNumbers2(n));
    }
    //optimize code
    static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> list=new ArrayList<>();
        int i=1; long mul=1;
        while(mul<=N){
            list.add(mul);
            i++;
            mul*=i;
        }
        return list;
    }
    static ArrayList<Long> factorialNumbers2(long N){
        ArrayList<Long> list=new ArrayList<>();
        long mul=1;
        for (int i = 1; mul <=N ; ) {
            list.add(mul);
            i++;
            mul*=i;
        }
        return list;
    }
}
