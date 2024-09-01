package NumberTheory_Math_BitManipulation;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)==true){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int i){
        //Find square root of i
        if(i<=1) return false;
        long sqr=2;
        while(sqr*sqr<=i){
            sqr++;
        }
        sqr=(int)sqr-1;
        //Find factors of n up to square root
        for(int j=2;j<=sqr;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
