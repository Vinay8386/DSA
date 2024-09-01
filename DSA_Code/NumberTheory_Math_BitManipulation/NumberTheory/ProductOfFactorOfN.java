package NumberTheory_Math_BitManipulation.NumberTheory;

import java.util.Scanner;

public class ProductOfFactorOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(factorProduct(n));
    }
    static int factorProduct(int N) {
        int m=(1000000007);
        long ans=N;
        for(int i=2;i*i<=N;i++){
            if(N%i==0){
                ans=ans*i;
                if((N/i)!=i){
                    ans=ans*(N/i);
                }
                ans=ans%m;
            }
        }
        return (int)ans%m;
    }
}
