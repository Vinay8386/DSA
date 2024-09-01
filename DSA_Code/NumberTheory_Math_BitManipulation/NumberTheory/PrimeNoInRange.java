package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNoInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        System.out.println();
        for (int val:primeRange(m,n)
             ) {
            System.out.print(val+" ");
        }
    }
    static ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=M;i<=N;i++){
            if(checkPrime(i)!=false){
                list.add(i);
            }
        }
        return list;
    }
    static boolean checkPrime(int a){
        if(a<=1) return false;
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
